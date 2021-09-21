import org.testng.annotations.Test;

public class gp1 {
	@Test(groups= {"m"}) 
	public void test_7() {
		System.out.println("test1");
	}
	@Test
	public void test_8() {
		System.out.println("test2");
	}
	@Test(groups= {"m"}) 
	public void test_9() {
		System.out.println("test3");
	}
}
