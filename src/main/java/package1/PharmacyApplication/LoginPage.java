package package1.PharmacyApplication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	WebDriver Driver;
	WebDriverWait wait=new WebDriverWait(Driver,Duration.ofSeconds(10));
	
	//step 1
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
			
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement signin;
	
	
	//step 2
	public void EnteringUsername()
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("8801429622");
		
	}
	public void clickOnsignin()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
	}
	public void clickOnContinue()
	{
		wait.until(ExpectedConditions.elementToBeClickable(continuebutton));
		continuebutton.click();
	}
	public void EnteringPassword()
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("201000");
	}
	//step 3
	public LoginPage(WebDriver Driver)
	{
		PageFactory.initElements(Driver,this);
	}
		
	

}
