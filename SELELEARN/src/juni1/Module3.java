package juni1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class Module3 {
	@Test
	public void LoginTest() {
		System.out.println("login sucess!!");
	}
	@Before
	public void OpenSite() {
		System.out.println("rediff is open");
	}
	@After
	public void CloseSite() {
		System.out.println("rediff is close");
	}
}
