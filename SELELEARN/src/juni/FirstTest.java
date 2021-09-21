package juni;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTest {
@Test
public void LoginTest() {
	System.out.println("login sucess!!");
}
@Before
public void OpenSite() {
	System.out.println("site is open");
}
@After
public void CloseSite() {
	System.out.println("site iis close");
}
@Test
public void Open() {
	System.out.println("opened");
}
}
