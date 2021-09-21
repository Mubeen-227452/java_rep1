package excerCise;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int q=n,res=0,fact=1,rem;
		while(q!=0) {
			rem=q%10;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			res=res+fact;
			fact=1;
			q=q/10;
		}
		if(res==n) {
			System.out.println(n+" "+"Is a Strong Number");
		}
		else {
			System.out.println(n+" "+"Is a Strong Number");
		}

	}

}
