package gtfs.data;

import java.net.URL;
import javafx.scene.paint.Color;

public class Route {

	private String Id;
	private String agencyId;
	private String shortName;
	private String longName;
	private String description;
	private RouteType type;
	private URL url;
	private Color color;
	private Color textColor;
	private int sortOrder;

	public Route(String id, String agencyId, String shortName, String longName,
		 String description, RouteType type, URL url, Color color, Color textColor, int sortOrder) {
		Id = id;
		this.agencyId = agencyId;
		this.shortName = shortName;
		this.longName = longName;
		this.description = description;
		this.type = type;
		this.url = url;
		this.color = color;
		this.textColor = textColor;
		this.sortOrder = sortOrder;
	}

	public Route(String id, String agencyId, String shortName, String longName,
		 String description, int type, URL url, Color color, Color textColor, int sortOrder) {
		Id = id;
		this.agencyId = agencyId;
		this.shortName = shortName;
		this.longName = longName;
		this.description = description;
		this.type = RouteType.from(type);
		this.url = url;
		this.color = color;
		this.textColor = textColor;
		this.sortOrder = sortOrder;
	}
}
