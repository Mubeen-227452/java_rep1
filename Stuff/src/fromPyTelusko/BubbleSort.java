package fromPyTelusko;

public class BubbleSort {

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
			for (int j=0;j<nums.length-i-1;j++) {
				if (nums[j]>nums[j+1]) {
					int t=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=t;
				}
			}
		}
		
	}

}
