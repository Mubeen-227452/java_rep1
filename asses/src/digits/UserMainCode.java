package digits;

public class UserMainCode {
	public static int getDigitSum(int n) {
		int sum=0;
		System.out.println("hi");
		while(n>9) {
			int a=0;sum=0;
			while(n!=0) {
				a=n%10;
				
				sum=sum+a;
				n=n/10;
			}
			n=sum;
		}
		return n;
	}
}
