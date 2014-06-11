package protocol.factory;

import protocol.GPRMCMessage;
import protocol.Message;
import protocol.PGIDMessage;
import protocol.TRCCRMessage;

public class MessageFactory {

	protected final static String PGID = "$PGID";
	
	protected final static String GPRMC = "$GPRMC";
	
	protected final static String TRCCR = "$TRCCR";
	
	protected final static String REGEX = "[,*]";
	
	public MessageFactory() {
		
	}
	
	public static Message getMessage(String msg) {
		String [] tokens = msg.split(REGEX);
		
		if (PGID.equals(tokens[0])) {
			return new PGIDMessage(tokens);
		} else if (GPRMC.equals(tokens[0])) {
			return new GPRMCMessage(tokens);
		} else if (TRCCR.equals(tokens[0])) {
			return new TRCCRMessage(tokens);
		}
		
		return null;
	}

}
