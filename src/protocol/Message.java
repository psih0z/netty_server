package protocol;

public abstract class Message {

	protected String type;
	
	protected String checksum;

	public Message(String type, String checksum) {
		this.type = type;
		this.checksum = checksum;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	@Override
	public String toString() {
		return "Message [type=" + type + ", checksum=" + checksum + "]";
	}
	
}
