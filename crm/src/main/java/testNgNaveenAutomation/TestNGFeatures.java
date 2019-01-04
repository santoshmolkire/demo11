package testNgNaveenAutomation;

import org.testng.annotations.Test;

public class TestNGFeatures {
@Test
public void login() {
	System.out.println("login page");
	try {
		System.out.println(10/0);
	}catch(ArithmeticException e) {
		System.out.println(10/2);
	}
}
@Test(dependsOnMethods="login")
public void homePage() {
	System.out.println("home page");
}


@Test(dependsOnMethods="login",invocationCount=10)
public void signUpPage() {
	System.out.println("signup pae");
}
}
