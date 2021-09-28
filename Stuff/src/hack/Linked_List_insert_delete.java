package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Linked_List_insert_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no of value:");
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int v=sc.nextInt();
			a.add(v);
		}
		System.out.println("ENter a no of quries:");
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
			String qu=sc.next();
			if(qu.equals("Insert")) {
				System.out.println("enter a position:");
				int x=sc.nextInt();
				System.out.println("enter a value:");
				int y=sc.nextInt();
				a.add(x, y);
			}else {
				System.out.println("Enter a position to remove ");
				int x=sc.nextInt();
				a.remove(x);
			}
		}
		for(Integer num:a) {
			System.out.print(num+" ");
		}

	}

}
