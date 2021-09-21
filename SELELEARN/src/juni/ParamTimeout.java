package juni;

import org.junit.Test;

public class ParamTimeout {
	
	@Test(timeout=1000)
	public void test_l() {
		while(true) {
			System.out.println("HI");
		}
	}

}
