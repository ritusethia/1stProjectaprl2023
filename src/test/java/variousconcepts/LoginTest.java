package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
////	System.setProperty("webdriver.chrome.driver","C:\\Users\\ritvy\\Selenium\\crm1\\driver\\chromedriver-win64\\chromedriver.exe");
////	WebDriver driver = new ChromeDriver();
//	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//	driver.findElement(By.name("password")).sendKeys("abc123");
//	driver.findElement(By.name("login")).click();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		launchBrowser();
	}

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
		driver.manage().window().maximize();
	}

	public static void positiveTestcase() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}

	public static void negativeTestcase() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

	}

	public static void closebrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
