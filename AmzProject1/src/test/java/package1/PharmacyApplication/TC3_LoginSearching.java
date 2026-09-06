package package1.PharmacyApplication;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)

public class TC3_LoginSearching extends BaseTest
{
	@Test(retryAnalyzer= RetryLogic.class)
	public void withValidCredSearching()
	{

}


}
