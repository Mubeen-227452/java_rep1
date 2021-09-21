package gradecalculator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UserMain {
	public static Map<String,String> calculateGrade(Map<String,Float> stud){
		Map<String,String>s=new LinkedHashMap<String,String>();
		Set<String>key=stud.keySet();
		for(String i:key) {
			if(stud.get(i)>=60) {
				s.put(i, "PASS");
			}
			else
				s.put(i, "FAIL");
		}
		return s;
	}

}
