import org.testng.Assert;
import org.testng.annotations.Test;

public class dp {

	@Test(dependsOnMethods = "reg")
	public void login() {
		System.out.println("hi sucess");
	}
	@Test
	public void reg() {
		String exp="rgs";
		String act="rgf";
		Assert.assertEquals(exp, act);
		System.out.println("reg sucess");
	}
}
