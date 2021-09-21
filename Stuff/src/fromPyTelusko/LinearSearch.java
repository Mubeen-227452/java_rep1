package fromPyTelusko;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[] {5,8,9,4,3,2};
		int n=1;
		
		int result=Search(arr1,n);
		
		if (result==-1) {
			System.out.println(" element "+n +" is  not present!");
		}
		else {
			System.out.println("element "+n+" Found at position "+(result+1));
		}
		
	}

	public static int Search(int[] arr1, int n) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==n) {
				
				return i;
				
			}
			
		}
		return -1;
		
		
	}

}
