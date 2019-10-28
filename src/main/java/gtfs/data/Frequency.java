package gtfs.data;

import gtfs.data.enums.Rounding;
import java.util.Date;

public class Frequency {

	// required
	private String tripId;
	private Date startTime;
	private Date endTime;
	private int headwaySeconds;

	// optional
	private Rounding exactTime;

	public Frequency(String tripId, Date startTime, Date endTime, int headwaySeconds,
		 Rounding exactTime) {
		this.tripId = tripId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.headwaySeconds = headwaySeconds;
		this.exactTime = exactTime;
	}
}
