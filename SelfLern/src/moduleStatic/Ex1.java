package moduleStatic;

public class Ex1 {
	int b=10;
	static {
		System.out.println("HI");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 a=new Ex1();
		System.out.println(a.b);
	}

}
