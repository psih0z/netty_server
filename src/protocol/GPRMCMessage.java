package protocol;

public class GPRMCMessage extends Message {

	// $GPRMC,162558.999,A,5511.2207,N,03013.2691,E,0.00,81.32,030614,,*35
	
	protected String date;
	
	protected double lat;
	
	protected String lat_direction;
	
	protected double lon;
	
	protected String lon_direction;
	
	protected double speed;
	
	protected double bearing;
	
	protected String calendar;
	
	public GPRMCMessage(String [] tokens) {
		super(tokens[0], tokens[tokens.length - 1]);
		
		this.date = tokens[1];
		
		this.lat = Double.valueOf(tokens[3]);
		this.lat_direction = tokens[4];
		
		this.lon = Double.valueOf(tokens[5]);
		this.lon_direction = tokens[6];
		
		this.speed = Double.valueOf(tokens[7]);
		
		this.bearing = Double.valueOf(tokens[8]);
		
		this.calendar = tokens[9];
	}

	@Override
	public String toString() {
		return "GPRMCMessage [date=" + date + ", lat=" + lat
				+ ", lat_direction=" + lat_direction + ", lon=" + lon
				+ ", lon_direction=" + lon_direction + ", speed=" + speed
				+ ", bearing=" + bearing + ", calendar=" + calendar + "]";
	}

}
