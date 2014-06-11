package packet;

import org.jboss.netty.channel.Channel;

import protocol.Message;

public class Packet {
	
	private final int id;
	
	private final Channel channel;
	
	private final Message message; 
	
	public int getId() {
		return id;
	}
	
	public Channel getChannel() {
		return channel;
	}
	
	public Message getMessage() {
		return message;
	}
	
	public Packet(int id, Message message, Channel channel) {
		this.id = id;
		this.channel = channel;
		this.message = message;
	}

}