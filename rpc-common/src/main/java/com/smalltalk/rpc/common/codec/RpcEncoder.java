package com.smalltalk.rpc.common.codec;

import com.smalltalk.rpc.common.utils.SerializationUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Created by hyb on 2017/7/5.
 *
 * RPC 编码器
 */
public class RpcEncoder extends MessageToByteEncoder{

    private  Class<?> genericClass;

    public RpcEncoder(Class<?> genericClass){
        this.genericClass=genericClass;
    }

    @Override
    public  void encode(ChannelHandlerContext ctx, Object in, ByteBuf out){
        if(genericClass.isInstance(in)){
            byte[] data= SerializationUtil.serialize(in);
            out.writeInt(data.length);
            out.writeBytes(data);
        }
    }
}
