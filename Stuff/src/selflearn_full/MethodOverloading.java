package selflearn_full;

public class MethodOverloading {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public float add(float a,float b) {
		return a+b;
	}
	public float add(float a,float b,float c) {
		return a+b+c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		System.out.println(m.add(2.0f, 2.0f));
		System.out.println(m.add(2.0f, 2.0f,2.5f));
		System.out.println(m.add(4,4));
		System.out.println(m.add(4,4,4));
		
	}

	

}
