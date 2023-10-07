package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_junit {
	static WebDriver driver;

	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void positiveTestcase() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Bank & Cash")).click();
		driver.findElement(By.linkText("New Account")).click();
		driver.findElement(By.name("account")).sendKeys("John Jimmy");
		driver.findElement(By.id("description")).sendKeys("checking account");
		driver.findElement(By.id("balance")).sendKeys("1500");
		driver.findElement(By.id("account_number")).sendKeys("12345678");
		driver.findElement(By.id("contact_person")).sendKeys("jimmy john");
		driver.findElement(By.id("contact_phone")).sendKeys("998877665");
		driver.findElement(By.id("ib_url")).sendKeys("https://techfios.com/billing/?ng=accounts/add-post");
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[2]/form/button")).click();

	}

//	@Test
//	public void negativeTestcase() {
//		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//		driver.findElement(By.name("password")).sendKeys("abc1234");
//
//	}

	@After
	public void closebrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}

}
