package testNgNaveenAutomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	/*for basic index html report refresh project
	 * go to test output in that right click on index html copy path 
	 * and post it to google
	 * 
	 */
	static WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@Test(priority=1,groups="Title")
	public void verifyGoogleTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Google";
		assertEquals(expectedTitle,actualTitle);
	}
	@Test(priority=2,groups="Logo")
	public void logoTest() {
		boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=3,groups="Test")
	public void test1() {
		System.out.println("test 1");
	}
	@Test(priority=4,groups="Test")
	public void test2() {
		System.out.println("test 2");
	}
	@Test(priority=5,groups="Test")
	public void test3() {
		System.out.println("test 3");
	}
	@Test(priority=6,groups="Test")
	public void test4() {
		System.out.println("test 4");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}












}
