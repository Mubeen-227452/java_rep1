package nameshrink;

import java.util.StringTokenizer;

public class UserMain {
	public static String getFormattedString(String s) {
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(s," ");
		String s1=st.nextToken();
		String s2=st.nextToken();
		String s3=st.nextToken();
		sb.append(s3).append(" ");
		sb.append(s2.substring(0, 1));
		sb.append(".");
		sb.append(s1.substring(0, 1));
		return sb.toString();
	}
}
