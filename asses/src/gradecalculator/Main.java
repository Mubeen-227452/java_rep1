package gradecalculator;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<String,Float>stud=new	LinkedHashMap<String,Float>();
		for(int i=0;i<n;i++) {
			stud.put(sc.next(), sc.nextFloat());
		}
		Map<String,String> res=new LinkedHashMap<String,String>();
		res=UserMain.calculateGrade(stud);
		Iterator<String>it=res.keySet().iterator();
		while(it.hasNext()) {
			String na=it.next();
			String r=res.get(na);
			System.out.println(na);
			System.out.println(r);
		}
		
		
	}

}
