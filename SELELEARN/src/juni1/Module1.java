package juni1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class Module1 {
	@Test
	public void LoginTest() {
		System.out.println("login sucess!!");
	}
	@Before
	public void OpenSite() {
		System.out.println("gmail is open");
	}
	@After
	public void CloseSite() {
		System.out.println("gmail is close");
	}

}
