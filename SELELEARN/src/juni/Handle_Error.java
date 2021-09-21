package juni;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import org.junit.Assert;

public class Handle_Error {
	@Rule
public	ErrorCollector er=new ErrorCollector();
	
	
	@Test
	public void test_log() {
		try {
			String exp="logout";
			String act="login";
			Assert.assertEquals(exp, act);
			
		}
		catch(Throwable e) {
			er.addError(e);
			System.out.println(er);
		}
		System.out.println("sorry!");
	}
}
