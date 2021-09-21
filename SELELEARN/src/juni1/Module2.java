package juni1;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Module2 {
	
	@Test
	public void LoginTest() {
		System.out.println("login sucess!!");
	}
	@BeforeClass
	public static void OpenSite() {
		System.out.println("yahoo is open");
	}
	@AfterClass
	public static void CloseSite() {
		System.out.println("yahoo is close");
	}
	@Test
	public void Open() {
		System.out.println("open");
	}

}
