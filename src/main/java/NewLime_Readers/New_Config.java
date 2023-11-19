package NewLime_Readers;


public class New_Config {

	private String Browser = New_Property.propReader().getProperty("browser");

	private String url = New_Property.propReader().getProperty("url");
	
	public String getBrowser() {
		return Browser;
	}

	public String getUrl() {
		return url;
	}
	
}

