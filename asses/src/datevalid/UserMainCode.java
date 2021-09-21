package datevalid;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode {
	public static int validateDate(String s) {
		if(s.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}")) {
			SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
			sdf.setLenient(false);
			try {
				Date d1=sdf.parse(s);
				return 1;
			}catch(ParseException e) {
				return -1;
			}
		}
		else if(s.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")) {
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			try {
				Date d1=sdf.parse(s);
				return 1;
			}catch(ParseException e) {
				return -1;
			}
		}
		else if(s.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}")) {
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			sdf.setLenient(false);
			try {
				Date d1=sdf.parse(s);
				return 1;
			}catch(ParseException e) {
				return -1;
			}
		}
		else {
			return -1;
		}
	}
}
