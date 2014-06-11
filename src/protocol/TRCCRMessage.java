package protocol;

public class TRCCRMessage extends Message {

	// $TRCCR,20140603164648.999,A,55.187088,30.221259,0.00,81.32,109.03,5,*3f
	
	protected String date;
	
	protected double lat;
	
	protected double lon;
	
	protected double speed;
	
	protected double bearing;
	
	protected double altitude;
	
	protected String battery;
	
	public TRCCRMessage(String [] tokens) {
		super(tokens[0], tokens[tokens.length - 1]);
		
		this.date = tokens[1];
		
		this.lat = Double.valueOf(tokens[3]);
		
		this.lon = Double.valueOf(tokens[4]);
		
		this.speed = Double.valueOf(tokens[5]);
		
		this.bearing = Double.valueOf(tokens[6]);
		
		this.altitude = Double.valueOf(tokens[7]);
		
		this.battery = tokens[8];
	}

	@Override
	public String toString() {
		return "TRCCRMessage [date=" + date + ", lat=" + lat + ", lon=" + lon
				+ ", speed=" + speed + ", bearing=" + bearing + ", altitude="
				+ altitude + ", battery=" + battery + "]";
	}

}
