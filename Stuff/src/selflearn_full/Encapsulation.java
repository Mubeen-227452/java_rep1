package selflearn_full;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s=new School();
		s.setSchoolname("MUUHSS");
		s.setSchoolid(12345);
		s.setSchool_start_year(1955);
		System.out.println(s.getSchoolname());
		System.out.println(s.getSchoolid());
		System.out.println(s.getSchool_start_year());
		
	}

}
