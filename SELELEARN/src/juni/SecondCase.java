package juni;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SecondCase {//example for before class,afterclass and ignore
@Test
public void LoginTest() {
	System.out.println("login sucess!!");
}
@BeforeClass
public static void OpenSite() {
	System.out.println("site is open");
}
@AfterClass
public static void CloseSite() {
	System.out.println("site iis close");
}
@Test
public void Open() {
	System.out.println("opened");
}
@Ignore
@Test
public void Close() {
	System.out.println("close");
}
}
