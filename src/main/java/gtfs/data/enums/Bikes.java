package gtfs.data.enums;

public enum Bikes {
	NO_INFO(0),
	ALLOWED(1),
	NOT_ALLOWED(2);

	private final int level;

	Bikes(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public static Bikes from(int level) {
		switch (level) {
			case 1:
				return ALLOWED;
			case 2:
				return NOT_ALLOWED;
			default:
				return NO_INFO;
		}
	}
}
