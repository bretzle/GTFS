package gtfs.data.enums;

public enum WheelChair {
	NO_INFO(0),
	POSSIBLY(1),
	NOT_POSSIBLE(2);

	private final int level;

	WheelChair(int level) {
		this.level = level;
	}

	public static WheelChair from(int level) {
		switch (level) {
			case 0:
				return NO_INFO;
			case 1:
				return POSSIBLY;
			case 2:
				return NOT_POSSIBLE;
			default:
				throw new IllegalArgumentException("Invalid level");
		}
	}

	public int getLevel() {
		return level;
	}
}
