package testNgNaveenAutomation;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	//preconditions annotations start with @Before
	@BeforeSuite//1
	public void setup() {
		System.out.println("set up");
	}
	@BeforeTest//2
	public void laucnhBrowser() {
		System.out.println("launch browser");
	}
	@BeforeClass//3
	public void enterUrl() {
		System.out.println("enter url");
	}
	@BeforeMethod//4
	public void login() {
		System.out.println("login into app");
	}
	
	//testcases..
	/*@BeforeMethod
	 * @test
	 * @AfterMethod
	 */
	@Test(priority=1)//5
	public void gmailTitleTest() {
		System.out.println("verify gmail title");
	}
	/*@BeforeMethod
	 * @test
	 * @AfterMethod
	 */

	@Test(priority=2)
	public void clickOnCompose() {
		System.out.println("clickOnCompose");
	}
	//postconditions annotations @After
	@AfterMethod//6
	public void logOut() {
		System.out.println("logout from app");
	}
	@AfterClass//7
	public void deleteAllcookies() 
	{
		System.out.println("delete all cookies");
	}
	@AfterTest//8
	public void closeBrowser(){
		System.out.println("close Browser");
	}
	@AfterSuite//9
	public void generateTestReport() {
		System.out.println("generate test report");
	}
}
