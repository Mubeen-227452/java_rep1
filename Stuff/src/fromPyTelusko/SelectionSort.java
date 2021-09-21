package fromPyTelusko;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=new int[] {5,7,8,2,3,1,4};
		sort(nums);
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
			
		}
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
