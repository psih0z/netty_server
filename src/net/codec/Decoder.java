package net.codec;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

import packet.Packet;
import packet.PacketManager;

public class Decoder extends FrameDecoder {

	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer) {
		Packet packet = new Packet(buffer.readUnsignedByte(), channel);
		PacketManager.handle(packet, buffer);
		return packet;
	}

}