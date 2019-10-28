package gtfs.data;

import gtfs.data.enums.TransferType;

public class Transfer {

	// required
	private String fromStopId;
	private String toStopId;
	private TransferType type;

	// optional
	private int minTime;

	public Transfer(String fromStopId, String toStopId, TransferType type, int minTime) {
		this.fromStopId = fromStopId;
		this.toStopId = toStopId;
		this.type = type;
		this.minTime = minTime;
	}
}
