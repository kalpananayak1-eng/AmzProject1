package package2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassGoogleLunch2
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		WebElement e1 = driver.findElement(By.cssSelector("#firstName"));
		e1.sendKeys("Kalpana");//TYPING
		Thread.sleep(2000);
		
		Actions a1  = new Actions(driver);
		a1.doubleClick(e1).perform();//CTRL+A
		
		Thread.sleep(2000);
		a1.contextClick(e1).perform();//RIGHT CLICK
		 Robot r1 = new Robot();
		 r1.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 r1.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		
		 r1.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		
		 r1.keyPress(KeyEvent.VK_DOWN);//SELECTING COPY OPTION
		 Thread.sleep(2000);
		 r1.keyPress(KeyEvent.VK_ENTER);//clicking on copy=CTRL+C
		 Thread.sleep(2000);
			WebElement e2 = driver.findElement(By.cssSelector("#lastName"));
			e2.sendKeys(Keys.CONTROL+"V");//PASTE 

		
		 
		 
		
		
		
		
		
		
		

	}

}
