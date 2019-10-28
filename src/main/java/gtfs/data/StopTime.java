package gtfs.data;

import gtfs.data.enums.DropOffType;
import gtfs.data.enums.Rounding;
import java.util.Date;

public class StopTime {

	// required
	private String id;
	private String stopId;
	private int sequence;

	// conditionally required
	private Date arrival;
	private Date departure;

	// optional
	private String headsign;
	private DropOffType pickup;
	private DropOffType dropOff;
	private float shapeDistTraveled;
	private Rounding timepoint;

	public StopTime(String id, String stopId, int sequence, Date arrival, Date departure,
		 String headsign, DropOffType pickup, DropOffType dropOff, float shapeDistTraveled,
		 Rounding timepoint) {
		this.id = id;
		this.stopId = stopId;
		this.sequence = sequence;
		this.arrival = arrival;
		this.departure = departure;
		this.headsign = headsign;
		this.pickup = pickup;
		this.dropOff = dropOff;
		this.shapeDistTraveled = shapeDistTraveled;
		this.timepoint = timepoint;
	}
}
