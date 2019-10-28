package gtfs.data.enums;

public enum RouteType {
	TRAM(0),
	SUBWAY(1),
	RAIL(2),
	BUS(3),
	FERRY(4),
	CABLE_CAR(5),
	GONDOLA(6),
	FUNICULAR(7);

	private final int level;

	RouteType(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public static RouteType from(int level) {
		switch (level) {
			case 0:
				return TRAM;
			case 1:
				return SUBWAY;
			case 2:
				return RAIL;
			case 3:
				return BUS;
			case 4:
				return FERRY;
			case 5:
				return CABLE_CAR;
			case 6:
				return GONDOLA;
			case 7:
				return FUNICULAR;
			default:
				throw new IllegalArgumentException("Invalid Route Type Level");
		}
	}
}
