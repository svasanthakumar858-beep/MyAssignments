package week2.day1;

public class Browser {
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser = new Browser();
		String launchBrowser = browser.launchBrowser("Google Chrome");
		System.out.println(launchBrowser);
		browser.loadUrl();

	}


}
