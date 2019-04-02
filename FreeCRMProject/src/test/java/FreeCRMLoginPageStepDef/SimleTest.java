package FreeCRMLoginPageStepDef;

import java.io.FileInputStream;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jetty.util.ArrayUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimleTest {
	public static void main(String[] args) throws InterruptedException {
		
		
		
/*		System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\ChromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "E:\\Browsers\\Geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		//driver.findElement(By.id("Email")).sendKeys("x@gmail.com");
		//driver.findElement(By.id("next")).click();
		//driver.findElement(By.id("Passwd")).sendKeys("xxx");
		//driver.findElement(By.id("signIn")).click();
		
		driver.findElement(By.id("identifierId")).sendKeys("sv.reshuram@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Araavrasr@1432");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=':it']/div/div")).click();
		
		List<WebElement> iframlist=driver.findElements(By.tagName("iframe"));
		for(int i=0;i<=iframlist.size();i++) {
			System.out.println(i);
		}
		
		
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		String currentFrame = jsExecutor.executeScript("return self.name").toString();
		System.out.println(currentFrame);
		//Thread.sleep(5000);
		//driver.switchTo().frame("oauth2relay1449573808");
		//driver.findElement(By.xpath("//div[@id=':og']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.id(":og")).sendKeys("abc@gmail.com");
		//driver.findElement(By.id(":mm")).sendKeys("Subject of the mail:Hi, Selenium");
		//driver.findElement(By.id(":lh")).sendKeys("Body of the mail");
		driver.findElement(By.id(":qd")).click();
		
*/		
		
		
		
		
		
		//output1=Ascending order output:10,20,30,40,50,60
		//output2=they want reverse order like 60,50,40,30,20,10
		int[][] x=new int [2][3];
		x[0][0]=10;
		x[0][1]=20;
		x[0][2]=30;
		x[1][0]=40;
		x[1][1]=50;
		x[1][2]=60;
		
	/*	for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				//System.out.println(x[i][j]);// output1:10,20,30,40,50,60
				
			}
		}*/
		
		for(int i=x.length-1;i>=0;i--) {
			for(int j=x[i].length-1;j>=0;j--) {
				System.out.println(x[i][j]);// output2:60,50,40,30,20,10
				
			}
		}
		
		
		
		
		
		
		
		
	/*	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values here:");
		int t=sc.nextInt();
		System.out.println("t value is"+".."+t);
		
		
		
	
		
		
		SimleTest d=new SimleTest();
		//d.reverse1(x);
		
		//d.reverse(x);
		
		
		
	}
	public void reverse(int[][] x) {
		for(int j=0; j<x.length;j++) {
			for(int i=0;i<x[j].length/2;i++) {
				int temp=x[j][i];
				x[j][i]=x[j][x[j].length-i-1];
				x[j][x[j].length-i-1]=temp;
			}
		}
	}
	public void reverse1() {
		int r=3;
		int c=3;
		int[][] arr=new int[r][c];
		int k=0;
		for(int i=0;i<r;r++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=k;
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr.length-1;j>=0;j--) {
				System.out.println(arr[i][j]+" ");
				
			}
			System.out.println();
		}
				*/
	}

}
