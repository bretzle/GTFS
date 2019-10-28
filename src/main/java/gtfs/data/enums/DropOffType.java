package gtfs.data.enums;

public enum DropOffType {
	SCHEDULED,
	NONE,
	PHONE_REQUIRED,
	COORDINATE_DRIVER;

	public static DropOffType from(int level) {
		switch (level) {
			case 1:
				return NONE;
			case 2:
				return PHONE_REQUIRED;
			case 3:
				return COORDINATE_DRIVER;
			default:
				return SCHEDULED;
		}
	}
}
