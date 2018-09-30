package testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import customclass.BaseClass;
import junit.framework.Assert;
import locators.repository.PageClass;
import rerun.Failed;

public class TestCase1 extends BaseClass {

	@BeforeClass
	@Parameters({ "browser" })
	public void launchBrowser(String bname) {
		driver = BaseClass.getDriver(bname, "https://www.seleniumhq.org/download/");
	}

	@Test
	public void titleVerify() {
		String title = BaseClass.getTitle();
		Assert.assertEquals("Downloads", title);
	}

	@Test(retryAnalyzer = Failed.class)
	public void elementIsPresentOrNot() {
		PageClass p = new PageClass();
		Assert.assertTrue(!elementIsPresent(p.getLink()));
	}

	@AfterClass
	public void quitbrowser() {
		BaseClass.browserQuit();
	}

}
