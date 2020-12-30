package leetcode713;

public class FindNumOfProductLess {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0){
            return 0;
        } 
        
        int cnt = 0;
        
        int product = 1;
        
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            
            while (left <= right && product >= k) {
                product /= nums[left++];
            }
            
            cnt += (right - left + 1);
        }
        return cnt;        
    }
}
