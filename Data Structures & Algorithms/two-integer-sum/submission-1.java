class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int result[] = new int[2];
        int[][] pair = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));

        int n = nums.length;

        int i=0, j = n-1;

        while(i < j) {
            if((pair[i][0]+pair[j][0]) == target) {
                result[0] = Math.min(pair[i][1], pair[j][1]);
                result[1] = Math.max(pair[i][1], pair[j][1]);
                return result;
            }
            if(pair[i][0]+pair[j][0] > target) j--;
            else i++;
        }

        return result;
    }
}