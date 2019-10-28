package gtfs.data;

public class Shape {

	// required
	private String id;
	private double latitude;
	private double longitude;
	private int sequence;

	// optional
	private double distTraveled;

	public Shape(String id, double latitude, double longitude, int sequence, double distTraveled) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.sequence = sequence;
		this.distTraveled = distTraveled;
	}
}
