package package1.PharmacyApplication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
	WebDriver Driver;
	WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(10));
	
	//step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountAndList;
	
	@FindBy(xpath="//a[@class='nav-action-signin-button']")
	private WebElement signin;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signOut;
	
	//step 2
	public void hoverOverOnAccountAndList(WebDriver Driver)
	{
		wait.until(ExpectedConditions.visibilityOf(accountAndList));
		Actions a1 =new Actions(Driver);
		a1.moveToElement(accountAndList).perform();
		
	}
	public void clickOnsignin()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
	}
	public void clickOnsignOut()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signOut));
		signOut.click();
	}
	//step 3
	public HomePage(WebDriver Driver)
	{
		PageFactory.initElements(Driver,this);
		
		
	}

}
