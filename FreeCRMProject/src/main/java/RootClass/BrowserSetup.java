package RootClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import LoadProperties.LoadProperties;

public class BrowserSetup {
	public LoadProperties prop;
	public static WebDriver driver;
	BaseClass base;
	
	public void initializationBrowserName(String keys, String values) {
		
		String browserName=prop.loadProperties("browser", "config");
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Browsers\\Geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("ie")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Browsers\\Geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver=new InternetExplorerDriver();
			
		}
		driver.get(prop.loadProperties("url", "config"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(base.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(base.PageLOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	
}
