package excerCise;

import java.util.Scanner;

public class Odd_or_even_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many elemnts: ");
		int l=s.nextInt();
		int n[]=new int[l]; 
		for(int i=0;i<l;i++) {
			System.out.println("enter the elemts "+i+": ");
			n[i]=s.nextInt();
		}
		
		int e=0;
		int o=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				
				e++;
				}
			else {
				o++;
			}
			}
		System.out.println(e+"-"+o);

	}

}
