package gtfs.data;

import gtfs.data.enums.PathMode;

public class Pathway {

	// required
	private String id;
	private String fromStopId;
	private String toStopId;
	private PathMode mode;
	private boolean bidirectional;

	// optional
	private float length;
	private int traversalTime;
	private int stairCount;
	private float maxSlope;
	private float minWidth;
	private String signPostedAs;
	private String reveredSignPostedAs;

	public Pathway(String id, String fromStopId, String toStopId, PathMode mode,
		 boolean bidirectional, float length, int traversalTime, int stairCount, float maxSlope,
		 float minWidth, String signPostedAs, String reveredSignPostedAs) {
		this.id = id;
		this.fromStopId = fromStopId;
		this.toStopId = toStopId;
		this.mode = mode;
		this.bidirectional = bidirectional;
		this.length = length;
		this.traversalTime = traversalTime;
		this.stairCount = stairCount;
		this.maxSlope = maxSlope;
		this.minWidth = minWidth;
		this.signPostedAs = signPostedAs;
		this.reveredSignPostedAs = reveredSignPostedAs;
	}
}
