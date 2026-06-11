class Solution {
    public int findMin(int[] nums) {
        int min = 1001;
        int start =0;
        int end = nums.length -1;
        while ( (start >= 0 && end >0) && 
        (start < nums.length -1 && end <= nums.length -1) &&
        start < end  ) {
            int mid = (start + end)/2;
            min = Math.min(min, nums[mid]);
            if(nums[mid] < nums[end]) {
                end = mid -1;
            } 
            else if(nums[mid] > nums[end]){
                start = mid +1;
            }
        }
        if(start == end) min = Math.min(min, nums[start]); 

        return min;
    }
}
