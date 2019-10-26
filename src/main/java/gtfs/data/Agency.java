package gtfs.data;

import java.net.URL;
import java.util.TimeZone;

public class Agency {

	// required
	private String id;
	private String name;
	private URL url;
	private TimeZone timezone;

	// optional
	private String lang;
	private String phone;
	private URL fareURL;
	private String email;

	public Agency(String id, String name, URL url, TimeZone timezone, String lang,
		 String phone, URL fareURL, String email) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.timezone = timezone;
		this.lang = lang;
		this.phone = phone;
		this.fareURL = fareURL;
		this.email = email;
	}
}
