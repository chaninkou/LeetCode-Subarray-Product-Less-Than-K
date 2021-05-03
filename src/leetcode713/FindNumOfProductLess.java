package leetcode713;

public class FindNumOfProductLess {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0){
            return 0;
        } 
        
        int resultCount = 0;
        
        int product = 1;
        
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            System.out.println("product: " + product);
          
            
            while (left <= right && product >= k) {
                product /= nums[left++];
                System.out.println("Over limit: " + product);

            }
            
            resultCount += (right - left + 1);
            System.out.println("RESULT: " + resultCount);

        }
        return resultCount;        
    }
}
