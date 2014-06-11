import protocol.Message;
import protocol.factory.MessageFactory;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Message message;
		
		String pgid = "$PGID,359871046023298*07";
		message = MessageFactory.getMessage(pgid);
		System.out.println(message);
		
		String gprmc = "$GPRMC,162558.999,A,5511.2207,N,03013.2691,E,0.00,81.32,030614,,*35";
		message = MessageFactory.getMessage(gprmc);
		System.out.println(message);
		
		String trccr = "$TRCCR,20140603164648.999,A,55.187088,30.221259,0.00,81.32,109.03,5,*3f";
		message = MessageFactory.getMessage(trccr);
		System.out.println(message);
		
	}

}
