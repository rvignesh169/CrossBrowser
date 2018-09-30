package testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import customclass.BaseClass;
import junit.framework.Assert;

public class TestCase1 extends BaseClass {
	
	@BeforeClass
	@Parameters({"browser"})
	public void launchBrowser(String bname) {
		System.out.println(bname);
		driver =BaseClass.getDriver(bname, "https://www.seleniumhq.org/download/");
	}
	
	@Test
	
	public void titleVerify() {
		String title = BaseClass.getTitle();
		System.out.println(title);
		Assert.assertEquals("Downloads", title);
	}
	
	@AfterClass
	public void quitbrowser() {
		BaseClass.browserQuit();
	}
	
}
