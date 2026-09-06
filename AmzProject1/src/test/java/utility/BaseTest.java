package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest extends ListenersLogic
{
	public static WebDriver driver;  
	@BeforeMethod
	@Parameters("browser")
	
	public void launch(@Optional("chrome") String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		    
		}
		if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@AfterMethod 
	public void quit() throws InterruptedException
	{
		Thread.sleep(2000);
	}

}



