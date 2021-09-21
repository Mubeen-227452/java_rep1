package maxsubstring;

import java.util.StringTokenizer;

public class UserMainCode {
	public static String extractMax(String inp1,String inp2) {
		String s3=null;
		int max=0;
		StringTokenizer st=new StringTokenizer(inp1,inp2);
		while(st.hasMoreTokens()) {
			String s2=st.nextToken();
			int n=s2.length();
			if(n>max) {
				max=n;
				s3=s2;
			}
		}
		return s3;
	}

}
