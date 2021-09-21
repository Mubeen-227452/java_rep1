import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class PrePost {
@BeforeSuite
public void pre() {
	System.out.println("preSuite");
}
@AfterSuite
public void post() {
	System.out.println("postSuite");
}
}
