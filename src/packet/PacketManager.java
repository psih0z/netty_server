package packet;

import org.jboss.netty.buffer.ChannelBuffer;

import packet.impl.*;

public final class PacketManager {
	
	private static final PacketHandler[] mass = new PacketHandler[255];
	
	public static void handle(Packet p, ChannelBuffer buf) {
		if (mass[p.getId()] != null) {
			mass[p.getId()].handle(p, buf);
			return;
		}
		mass[0].handle(p, buf);
	}
	
	static {
		mass[0] = new DefaultPacketHandler();
	}

}