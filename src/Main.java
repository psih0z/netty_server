import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import net.PipelineFactory;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.socket.oio.OioServerSocketChannelFactory;

public final class Main {
	
	private static final ServerBootstrap bootstrap = new ServerBootstrap(
			new OioServerSocketChannelFactory(
					Executors.newCachedThreadPool(),
					Executors.newCachedThreadPool()));
	private static final Logger logger = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
//		int port = Integer.parseInt(args[0]);
		int port = 8887;
		
		bootstrap.setOption("keepAlive", true);
		bootstrap.setPipelineFactory(new PipelineFactory());
		bootstrap.bind(new InetSocketAddress(port));

		logger.info("Server binded on port: " + port);		
	}

}