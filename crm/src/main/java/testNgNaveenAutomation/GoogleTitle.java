package testNgNaveenAutomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitle {
	static WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	/*@Test
	public void verifyGoogleTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Google","title not matched");
	}*/
	@Test
	public void logoTest() {
		boolean b=driver.findElement(By.id("hplgo")).isDisplayed();
		//System.out.println(b);
		//Assert.assertTrue(b);
		Assert.assertEquals(b, true);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
