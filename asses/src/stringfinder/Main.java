package stringfinder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		int b=UserMainCode.StringFinder(s1,s2,s3);
		if(b==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
