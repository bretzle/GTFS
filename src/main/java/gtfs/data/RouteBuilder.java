package gtfs.data;

import java.net.MalformedURLException;
import java.net.URL;
import javafx.scene.paint.Color;

public final class RouteBuilder {

	private String id;
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

	public RouteBuilder(String id) {
		this.id = id;
		this.description = "";
		this.url = Route.DEFAULT_URL;
		this. color = Color.BLACK;
		this.textColor = Color.BLACK;
		this.sortOrder = 0;
	}

	public RouteBuilder withAgencyId(String agencyId) {
		this.agencyId = agencyId;
		return this;
	}

	public RouteBuilder withShortName(String shortName) {
		this.shortName = shortName;
		return this;
	}

	public RouteBuilder withLongName(String longName) {
		this.longName = longName;
		return this;
	}

	public RouteBuilder withType(RouteType type) {
		this.type = type;
		return this;
	}

	public RouteBuilder withType(int type) {
		this.type = RouteType.from(type);
		return this;
	}

	public RouteBuilder withDescription(String description) {
		this.description = description;
		return this;
	}

	public RouteBuilder withUrl(URL url) {
		this.url = url;
		return this;
	}

	public RouteBuilder withColor(Color color) {
		this.color = color;
		return this;
	}

	public RouteBuilder withTextColor(Color textColor) {
		this.textColor = textColor;
		return this;
	}

	public RouteBuilder withSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
		return this;
	}

	public Route build() {
		return new Route(id, agencyId, shortName, longName, description, type, url, color,
			 textColor, sortOrder);
	}
}
