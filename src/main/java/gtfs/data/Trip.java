package gtfs.data;

import gtfs.data.enums.Bikes;
import gtfs.data.enums.Direction;
import gtfs.data.enums.WheelChair;

public class Trip {

	// required
	private String id;
	private String serviceId;
	private String routeId;

	// optional
	private String headsign;
	private String shortName;
	private Direction directionId;
	private String blockId;
	private String shapeId;
	private WheelChair wheelchairAccessible;
	private Bikes bikeAllowed;

	public Trip(String id, String serviceId, String routeId, String headsign,
		 String shortName, Direction directionId, String blockId, String shapeId,
		 WheelChair wheelchairAccessible, Bikes bikeAllowed) {
		this.id = id;
		this.serviceId = serviceId;
		this.routeId = routeId;
		this.headsign = headsign;
		this.shortName = shortName;
		this.directionId = directionId;
		this.blockId = blockId;
		this.shapeId = shapeId;
		this.wheelchairAccessible = wheelchairAccessible;
		this.bikeAllowed = bikeAllowed;
	}
}
