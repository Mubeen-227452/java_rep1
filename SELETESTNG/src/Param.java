import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Param {
	@Test(dataProvider="T_data")
	public void log_test(String username, String password) {
		System.out.println(username+"--"+password);
	}
	@DataProvider
	public String [][] T_data() {
		String d[][]=new String[2][2];
		d[0][0]="mohamed";
		d[0][1]="mub";
		d[1][0]="divan";
		d[1][1]="syed";
		return d;
		
	}
	
}
