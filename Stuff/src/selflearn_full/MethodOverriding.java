package selflearn_full;



class sample{
	void msg() {
		System.out.println("Hello iam froom sample class");
	}
}
public class MethodOverriding extends sample {
	void msg() {
		System.out.println("Iam from main class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding m=new MethodOverriding();
		m.msg();
		sample s=new sample();
		s.msg();
	}

}
