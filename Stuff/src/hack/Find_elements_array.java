package hack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Find_elements_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n=sc.nextInt();
		ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("enter how may elemts wants in line no|"+(i+1)+":");
			int d=sc.nextInt();
			 ArrayList<Integer> row = new ArrayList<>();
			for(int j=0;j<d;j++) {
				row.add(sc.nextInt());
			}
			rows.add(row);
			
		}
		System.out.println("enter the how many quries you want:");
		int q=sc.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println("enter the line no:");
			int x=sc.nextInt();
			System.out.println("enter the position:");
			int y=sc.nextInt();
			try {
				System.out.println(rows.get(x-1).get(y-1));
			}catch(Exception e) {
				System.out.println("Error");
			}
			
		}
	}

}
