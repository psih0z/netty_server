package net;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

import packet.Packet;

public class ChannelHandler extends SimpleChannelHandler {
	
	@Override
	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e)
			throws Exception {
		System.out.println("connected!");
	}
	
	@Override
	public void channelDisconnected(ChannelHandlerContext ctx,
			ChannelStateEvent e) throws Exception {
		System.out.print("disconnected!");
	}
	
	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
			throws Exception {
		
		Packet packet = (Packet) e.getMessage();
		System.out.println(packet.getMessage().toString());
        
		// Соберем его для отправки обработчику
        /*Packet packet = new Packet();
        packet.setData( msg );
        packet.setSender( session );*/

		// Поставим пакет в очередь обработки сесссии
        /*session.addReadPacketQueue(packet);*/

		// Поставим сессию в очередь обработки логики
        /*Server.getReader().addSessionToProcess( session );*/
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
		e.getCause().printStackTrace();
	}

}