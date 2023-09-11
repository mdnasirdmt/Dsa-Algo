package generalProblems;

import java.util.Arrays;

public class CountUnique {

	public static void main(String[] args) {
		
		int[] nums = {0,1,1,0,2,3,3,1,2,4};
		Arrays.sort(nums);
		
		int j=1;
		
		for (int i = 1; i < nums.length; i++) {
			
			if(nums[i-1]!=nums[i]) {
//				nums[j]=nums[i];
				j++;
			}
			
		}
		
		System.out.println(j);
		System.out.println(Arrays.toString(nums));
	}

}
