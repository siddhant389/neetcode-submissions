class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = 0;
        int i=0,j=0;

        while( j < nums.length ) {
          if(nums[j] != val) {
            if(i != j) {
              int temp = nums[j];
              nums[j] = nums[i];
              nums[i] = temp;
            }
            j++;
            i++;
            k++;
          } else {
            j++;
          } 
        }
        return k;
    }
}