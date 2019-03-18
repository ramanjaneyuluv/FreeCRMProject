package RootClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RootClassCRM {
	public static Properties prop;
	public static WebDriver driver;
	BaseClass base;
	
	
	public RootClassCRM() {
		try {
			prop=new Properties();
			FileInputStream file=new FileInputStream("C:\\Users\\Baji786\\eclipse-workspace\\FreeCRMProject\\src\\main\\java\\ConfigFiles\\Config.properties");
			prop.load(file);
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
	
	public void initializationBrowserName() {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Browsers\\Geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("ie")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Browsers\\Geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver=new InternetExplorerDriver();
			
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(base.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(base.PageLOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	
}
