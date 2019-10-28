package gtfs.data.enums;

public enum TransferType {
	RECOMMENDED,
	TIMED,
	MINIMUM,
	NOT_POSSIBLE;

	public static TransferType from(int level) {
		switch (level) {
			case 1:
				return TIMED;
			case 2:
				return MINIMUM;
			case 3:
				return NOT_POSSIBLE;
			default:
				return RECOMMENDED;
		}
	}
}
