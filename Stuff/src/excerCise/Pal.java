package excerCise;

import java.util.Scanner;

public class Pal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int q=n;
		int res=0;
		while(q!=0) {
			int rem=q%10;
			res=res*10+rem;
			q=q/10;
		}
		if(res==n) {
			System.out.println("It's Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
