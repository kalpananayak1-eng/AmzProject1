package package1.PharmacyApplication;									

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)

public class TC1_LoginToAmazon extends BaseTest
{
	@Test(retryAnalyzer= RetryLogic.class)
	public void withValidCred()
	{
		Reporter.log("browser and url launched successfully");
		SoftAssert a1 =new SoftAssert();
		HomePage homepage=new HomePage(driver);
		homepage.hoverOverOnAccountAndList(driver);
		homepage.clickOnsignin();
		Reporter.log("Hoverover on Account and List is successful");
		Reporter.log("click on signin is successful");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.EnteringUsername();
		Reporter.log("Email_id is successfully entered");
		loginpage.clickOnContinue();
		loginpage.EnteringPassword();
		Reporter.log("password is  successfully entered");
		loginpage.clickOnsignin();
		Reporter.log("login is successfully done");
		a1.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		a1.assertAll();
		Reporter.log("TestCase is pass");
	
		
	}

}
