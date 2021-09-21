package excerCise;

public class HashPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=4) {
			System.out.print("#");
			int j=1;
			while (j<=3){
				System.out.print("#");
				j++;
				
			}
			i++;
			System.out.println();
		}
		
		
		int num1=1;
		while (num1<=100) {
			if (num1%3==0 ||num1%5==0) {
				num1++;
				continue;
			}
			else {
				System.out.print(num1+" ");
				num1++;
			}
		}

	}

}
