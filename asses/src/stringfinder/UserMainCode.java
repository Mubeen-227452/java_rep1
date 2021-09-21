package stringfinder;

public class UserMainCode {
	public static int StringFinder(String s1,String s2,String s3) {
		String a1=s1.toLowerCase();
		String a2=s2.toLowerCase();
		String a3=s3.toLowerCase();
		if(a1.contains(a2)&&a1.contains(a3)) {
			if(a1.indexOf(a2)<a1.indexOf(a3)) {
				return 1;
			}
			else 
				return 2;
		}
		return 0;
	}
}
