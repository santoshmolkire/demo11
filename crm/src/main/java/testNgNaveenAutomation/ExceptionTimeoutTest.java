package testNgNaveenAutomation;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	//@Test(timeOut=2)
	@Test(invocationTimeOut=2)
	public void infiniteLoop() {
		int a=1;
		while(a==1) {
			System.out.println(a);
		}
	}
	
}
