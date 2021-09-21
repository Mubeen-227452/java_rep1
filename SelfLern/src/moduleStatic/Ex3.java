package moduleStatic;

public class Ex3 {
	static int count=0;
	

	public Ex3() {
		count ++;
		System.out.println(count);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3 a=new Ex3();
		Ex3 b=new Ex3();
		Ex3 c=new Ex3();
		
	}

}
