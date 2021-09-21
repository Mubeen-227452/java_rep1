package excerCise;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		odd_or_even(n);
	}

	public static void odd_or_even(int n) {
		// TODO Auto-generated method stub
		if (n%2==0)
			System.out.println(n+" Even");
		else
			System.out.println(n+"Odd");
		
	}

}
