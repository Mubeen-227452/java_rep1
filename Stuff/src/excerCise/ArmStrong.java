package excerCise;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int q=n;
		int cnt=0,count=0,rem=0,result=0,mul=1;
		while(q!=0) {
			q=q/10;
			count++;
			
		}
		q=n;
		cnt=count;
		while(q!=0) {
			rem=q%10;
			while(cnt!=0) {
				mul=mul*rem;
				cnt--;				
			}
			result=result+mul;
			cnt=count;
			q=q/10;
			mul=1;
		}
		if(result==n) {
			System.out.println("ARMSTRONG");
		}
		else {
			System.out.println("NOT ARMSTRONG");
		}
	}

}
