package customclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static  WebDriver getDriver(String bname, String url) {
		
		if(bname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\eclipse-java-photon-R-win32-x86_64\\testngpra\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println(1);
			driver.get(url);
			}
		
		else if(bname.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "E:\\Selenium\\eclipse-java-photon-R-win32-x86_64\\testngpra\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println(2);
			driver.get(url);
			}
		
		else if(bname.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\eclipse-java-photon-R-win32-x86_64\\testngpra\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println(3);
			driver.get(url);
			}

		return driver;
		}
	
	public static String getTitle() {
		System.out.println("hi");
		System.out.println(driver);
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public static void browserQuit() {
		driver.quit();
	}
	
	
}
