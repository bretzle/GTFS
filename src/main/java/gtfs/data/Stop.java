package gtfs.data;

import gtfs.data.enums.LocationType;
import gtfs.data.enums.WheelChair;
import java.net.URL;
import java.util.TimeZone;

public class Stop {

	// required
	private String id;
	private String name;

	// conditionally required
	private String latitude;
	private String longitude;
	private String zoneId;
	private String parentStation;

	// optional
	private String code;
	private String description;
	private URL url;
	private LocationType type;
	private TimeZone timezone;
	private WheelChair wheelChair;
	private String levelId;
	private String platformCode;

	public Stop(String id, String name, String latitude, String longitude, String zoneId,
		 String parentStation, String code, String description, URL url, LocationType type,
		 TimeZone timezone, WheelChair wheelChair, String levelId, String platformCode) {
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.zoneId = zoneId;
		this.parentStation = parentStation;
		this.code = code;
		this.description = description;
		this.url = url;
		this.type = type;
		this.timezone = timezone;
		this.wheelChair = wheelChair;
		this.levelId = levelId;
		this.platformCode = platformCode;
	}
}
