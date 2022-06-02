package cicdfortesters;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {
	
	public static WebDriver driver; 

	@BeforeMethod
	public void launchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void Test1() {
		driver.get("https://letcode.in/");	
		System.out.println("Test1: " +driver.getTitle());
	}
	
	@Test
	public void Test2() {
		driver.get("http://www.learnautomationonline.site/2018/05/jenkins-getting-started.html");	
		System.out.println("Test2: " +driver.getTitle());
	}
	
	@Test
	public void Test3() {
		driver.get("https://www.testingminibytes.com/");	
		System.out.println("Test3: " +driver.getTitle());
	}
	
	
	@AfterMethod
	public void quit() {
		driver.close();
		
	}










}
