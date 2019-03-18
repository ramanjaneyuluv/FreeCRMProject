package FreeCRMLoginPageStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimleTest {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\ChromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "E:\\Browsers\\Geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("xxx@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".I0VJ4d > div:nth-child(1) > input:nth-child(1)")).sendKeys("assggd");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}

}
