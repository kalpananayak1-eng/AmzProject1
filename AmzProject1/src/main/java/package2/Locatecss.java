package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatecss
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement e1=driver.findElement(By.cssSelector("textarea[name='q']"));
		e1.sendKeys("Automation Testing by grotechminds" );


	}

}
