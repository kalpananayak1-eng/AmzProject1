package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogic implements ITestListener//here right click on itestlistener after source after override implement methods after success test result put tick and failed testresult put tick then write code
{
 //public static WebDriver driver;
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String testname = result.getName();
		ITestListener.super.onTestSuccess(result);
		Date d1=new Date();
		System.out.println(d1.getTime());

		Date d2=new Date(d1.getTime());
		System.out.println(d2); 
		String s1= d2.toString();
		String month= s1.substring(4, 7);

		String date= s1.substring(8, 10);
		String hour= s1.substring(11, 13);
		String min= s1.substring(14, 16);
		String sec= s1.substring(17, 19);
		String year= s1.substring(s1.length()-4);

		String format1=date.concat(month).concat(year);
		System.out.println(format1);

		
		TakesScreenshot ts = (TakesScreenshot)  BaseTest.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//File destination = new File("C:\\Users\\PC\\eclipse-workspace\\Automation\\test-output\\NewScreen\\Firsttestcase.png");//it will not again show same screenshot it will replace new will come
		File destination = new File("C:\\Users\\PC\\eclipse-workspace\\PharmacyApplication\\test-output\\screenshot\\pass"+result.getName()+format1 +".png");// all will come here screenshot will not replace all screenshot will come
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		@Override
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestFailure(result);
			
			Date d1=new Date();
			System.out.println(d1.getTime());

			Date d2=new Date(d1.getTime());
			System.out.println(d2); 
			String s1= d2.toString();
			String month= s1.substring(4, 7);

			String date= s1.substring(8, 10);
			String hour= s1.substring(11, 13);
			String min= s1.substring(14, 16);
			String sec= s1.substring(17, 19);
			String year= s1.substring(s1.length()-4);

			String format1=date.concat(month).concat(year);
			System.out.println();

			
			TakesScreenshot ts = (TakesScreenshot)  BaseTest.driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String testName = result.getName();
			String fileName = testName + " " + format1  + ".png "; 
			//File destination = new File("C:\\Users\\PC\\eclipse-workspace\\Automation\\test-output\\NewScreen\\Firsttestcase.png");//it will not again show same screenshot it will replace new will come
			File destination = new File("C:\\Users\\PC\\eclipse-workspace\\PharmacyApplication\\test-output\\screenshot\\fail\\"+result.getName()+format1+".png");// all will come here screenshot will not replace all screenshot will come
			try {
				if (!destination.getParentFile().exists())
				{
					destination.getParentFile().mkdirs();
				}
				org.openqa.selenium.io.FileHandler.copy(source, destination);
				System.out.println("Screenshot saved to: " + destination.getAbsolutePath());
				//FileHandler.copy(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}
	
		
		



