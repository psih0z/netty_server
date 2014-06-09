package packet;

import org.jboss.netty.channel.Channel;

public class Packet {
	
	private final int id;
	private final Channel channel;
	
	public int getId() {
		return id;
	}
	public Channel getChannel() {
		return channel;
	}
	
	public Packet(int id, Channel channel) {
		this.id = id;
		this.channel = channel;
	}

}