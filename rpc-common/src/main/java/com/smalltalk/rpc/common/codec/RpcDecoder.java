package com.smalltalk.rpc.common.codec;


import com.smalltalk.rpc.common.utils.SerializationUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * Created by hyb on 2017/7/5.
 *
 * RPC 解码器
 */
public class RpcDecoder extends  ByteToMessageDecoder{

    private Class<?> genericClass;

    public RpcDecoder(Class<?> genericClass) {
        this.genericClass=genericClass;
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if(byteBuf.readableBytes()<4)
            return;

        byteBuf.markReaderIndex();
        int dataLength=byteBuf.readInt();
        if(byteBuf.readableBytes()<dataLength){
            byteBuf.resetReaderIndex();
            return;
        }

        byte[] data=new byte[dataLength];
        byteBuf.readBytes(data);
        list.add(SerializationUtil.deserialize(data,genericClass));
    }
}
