package gtfs.data;

public enum Direction {
	INBOUND,
	OUTBOUND;

	public static Direction from(int level) {
		switch (level) {
			case 0:
				return OUTBOUND;
			case 1:
				return INBOUND;
			default:
				throw new IllegalArgumentException("Invalid Level");
		}
	}
}
