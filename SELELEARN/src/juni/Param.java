package juni;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Param {
	String Firstname;
	String lastname;
	@Test
	public void test_reg() {
		System.out.println(Firstname+" "+lastname);
	}
	
	
	
	public Param(String firstname, String lastname) {
		this.Firstname = firstname;
		this.lastname = lastname;
	}
	
	@Parameters
	public static Collection<String[]>data(){
		String data[][]=new String[2][2];
		data[0][0]="mohamed";
		data[0][1]="mub";
		data[1][0]="mohamed";
		data[1][1]="kather";
		return Arrays.asList(data);
	}
}
