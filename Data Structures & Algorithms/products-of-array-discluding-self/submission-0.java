class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int[] product = new int[nums.length];
        int[] reverseProduct = new int[nums.length];
        
        product[0] = nums[0];
        for(int i=1; i < nums.length; i++) {
            product[i] = product[i-1]*nums[i];
        }

        reverseProduct[nums.length -1] = nums[nums.length -1];
        for(int i=nums.length -2; i >= 0; i--) {
            reverseProduct[i] = reverseProduct[i+1]*nums[i];
        }

        for(int i=0; i < nums.length; i++) {
            if( i == 0 ) result[i] = reverseProduct[i+1];
            else if (i == nums.length -1) result[i] = product[i-1];
            else {
                result[i] = product[i-1]*reverseProduct[i+1];
            }
        }    
    
        return result;
    }
}  
