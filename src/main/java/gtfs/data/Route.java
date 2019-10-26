package gtfs.data;

import java.net.MalformedURLException;
import java.net.URL;
import javafx.scene.paint.Color;

public class Route {

	public static URL DEFAULT_URL;

	static {
		try {
			DEFAULT_URL = new URL("https://www.google.com/");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	// required
	private final String Id;
	private String agencyId;
	private String shortName;
	private String longName;
	private RouteType type;

	// optional
	private String description;
	private URL url;
	private Color color;
	private Color textColor;
	private int sortOrder;

	public Route(String id, String agencyId, String shortName, String longName,
		 String description, RouteType type, URL url, Color color, Color textColor, int sortOrder) {
		if (id == null || agencyId == null || shortName == null || longName == null || type == null) {
			throw new IllegalArgumentException("A required Field is null");
		}

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
}
