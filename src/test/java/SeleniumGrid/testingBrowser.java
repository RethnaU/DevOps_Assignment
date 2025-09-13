package SeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testingBrowser {
	public WebDriver driver;
	@Parameters({"browser"})
  @Test
  public void CrossTesting(String browser) 
  {
	  if(browser.equals("Chrome")) {
		  driver= new ChromeDriver();
	  }else if(browser.equals("Firefox")) {
		  driver= new FirefoxDriver();
	  }else if(browser.equals("Edge")) {
		  driver = new EdgeDriver();
	  }
	  driver.get("https://www.amazon.in");
	  System.out.println("Title is :"+driver.getTitle());
  }
}
