package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testingBrowser {
	public WebDriver driver;
	@Parameters({"browser"})
  @Test
  public void CrossTesting(String browser) throws MalformedURLException, InterruptedException 
  {
		 System.out.println("Remote connection is starting.....");
	  if(browser.equals("Chrome"))
	  {
		  ChromeOptions options = new ChromeOptions();
		  driver= new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Session created on Chrome");
		  
	  }else if(browser.equals("Firefox")) 
	  {
		  FirefoxOptions options = new FirefoxOptions();
		  driver= new RemoteWebDriver(new URL("http://localhost:4444"),options);  
		  System.out.println("Session created on Firefox");
	  }
	  else if(browser.equals("Edge")) {
		  EdgeOptions options = new EdgeOptions();
		  driver= new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Session created on Edge");
	  }
	  System.out.println("Remote connection is established");
	  Thread.sleep(10000);
	  driver.get("https://www.amazon.in");
	  Thread.sleep(5000);
	  System.out.println("Title is :"+driver.getTitle());
	  driver.quit();
  }
}
