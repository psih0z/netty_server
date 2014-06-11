package protocol;

public class PGIDMessage extends Message {

	// $PGID,359871046023298*07
	
	protected String imei;
	
	public PGIDMessage(String [] tokens) {
		super(tokens[0], tokens[2]);
		
		this.imei = tokens[1];
	}

	@Override
	public String toString() {
		return "PGIDMessage [imei=" + imei + "]";
	}

}
