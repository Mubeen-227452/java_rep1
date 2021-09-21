package fromPyTelusko;

public class BinarySearch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[] {4,7,2,8,12,45,99};
		int n=22;
		sort(arr1);
		
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
		int l=0;
		int u=arr1.length-1;
		while (l<=u) {
			int m=(l+u)/2;
			if (arr1[m]==n) {
				return m;
			}
			else {
				if(arr1[m]<n) {
					l=m+1;
				}else {
					u=m-1;
				}
			}
			
			
		}
		return -1;
		
		
	}
	public static void sort(int[] nums) {
		// TODO Auto-generated method stub
		for(int i=0;i<nums.length-1;i++) {
			int min=i;
			for(int j=i;j<nums.length;j++) {
				if(nums[j]<nums[min]) {
					min=j;
				}
			}
			int t=nums[i];
			nums[i]=nums[min];
			nums[min]=t;
		}

}

}
	