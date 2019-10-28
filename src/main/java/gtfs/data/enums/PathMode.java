package gtfs.data.enums;

public enum PathMode {
	WALKWAY,
	STAIRS,
	MOVING,
	ESCALATOR,
	ELEVATOR,
	FARE_GATE,
	EXIT_GATE;

	public static PathMode from(int level) {
		switch (level) {
			case 1:
				return WALKWAY;
			case 2:
				return STAIRS;
			case 3:
				return MOVING;
			case 4:
				return ESCALATOR;
			case 5:
				return ELEVATOR;
			case 6:
				return FARE_GATE;
			case 7:
				return EXIT_GATE;
			default:
				throw new IllegalArgumentException("Invalid level");
		}
	}
}
