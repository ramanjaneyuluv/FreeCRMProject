package POMLoginPage;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RootClass.RootClassCRM;

public class POMLoginPage extends RootClassCRM{
	
	public static Properties prop;
	public static WebDriver driver;
	
	public POMLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="username") WebElement userName;
	@FindBy(name="password") WebElement passWord;
	@FindBy(xpath=("//input[@type='submit']")) WebElement loginBtn;
	
	public void user_Name(String un) {
		userName.sendKeys(un);
		//prop.getProperty("username")
	}
	public void pass_Word(String pw) {
		passWord.sendKeys(pw);
		//prop.getProperty("password")
		
	}
	public void loginBtn() {
		JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("arguments[0].click();", loginBtn);
		
	}

 }
