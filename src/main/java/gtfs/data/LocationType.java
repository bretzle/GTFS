package gtfs.data;

public enum LocationType {
	STOP(0),
	STATION(1),
	ENTRANCE_EXIT(2),
	GENERIC_NODE(3),
	BOARDING_AREA(4);

	private final int level;

	LocationType(int level) {
		this.level = level;
	}

	public static LocationType from(int level) {
		switch (level) {
			case 0:
				return STOP;
			case 1:
				return STATION;
			case 2:
				return ENTRANCE_EXIT;
			case 3:
				return GENERIC_NODE;
			case 4:
				return BOARDING_AREA;
			default:
				throw new IllegalArgumentException("Invalid level");
		}
	}

	public int getLevel() {
		return level;
	}
}
