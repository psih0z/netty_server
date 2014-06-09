package net;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;

public class PipelineFactory implements ChannelPipelineFactory {

	@Override
	public ChannelPipeline getPipeline() {
		ChannelPipeline next = Channels.pipeline();
		
		next.addLast("handler", new ChannelHandler());
		
		return next;
	}

}