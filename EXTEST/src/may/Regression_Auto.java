package may;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Regression_Auto {
	
	
	@Test(priority=3)
	public void login() {
		System.out.println("testng login");
	}
	@BeforeMethod
	public void openGmail() {
		System.out.println("open gmail");
	}
	@AfterMethod
	public void closegmail() {
		System.out.println("close gmail");
	}
	@Test(priority=2)
	public void regtest()
	{
		System.out.println("reg");
	}
	@Test(priority=1)
	public void sendtest() {
		System.out.println("send");
	}
}
