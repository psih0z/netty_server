package packet.impl;

import java.util.logging.Logger;

import org.jboss.netty.buffer.ChannelBuffer;

import packet.Packet;
import packet.PacketHandler;

public class DefaultPacketHandler implements PacketHandler {
	
	private static final Logger logger = Logger.getLogger(DefaultPacketHandler.class.getName());

	@Override
	public void handle(Packet p, ChannelBuffer buf) {
		logger.info("Unhandled packet: " + p.getId());
	}

}