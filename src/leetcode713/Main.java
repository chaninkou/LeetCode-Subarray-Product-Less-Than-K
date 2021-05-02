package leetcode713;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {10,5,2,6};
		
		int k = 100;
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		System.out.println("K: " + k);
		
		FindNumOfProductLess solution = new FindNumOfProductLess();
		
		System.out.println(solution.numSubarrayProductLessThanK(nums, k));
		
	}
}
