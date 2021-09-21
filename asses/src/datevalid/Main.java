package datevalid;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int b=UserMainCode.validateDate(s);
		if(b==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		sc.close();

	}

}
