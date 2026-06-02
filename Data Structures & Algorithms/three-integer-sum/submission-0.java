class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Map<String, List<Integer>> map = new HashMap<>();
        Arrays.sort(nums);

        for(int i=0; i < nums.length; i++) {
            int j= i+1, k = nums.length-1;
            int target = 0 - nums[i];
            while(j < k){
                if(nums[j]+nums[k] == target) {
                    String key = nums[i]+","+nums[j]+","+nums[k];
                    if(!map.containsKey(key)){
                         map.put(key ,new ArrayList(List.of(nums[i],nums[j],nums[k])));
                    }     
                    j++;
                }
                else if(nums[j]+nums[k] > target) k--;
                else j++;
            }
        }
        List<List<Integer>> result = new ArrayList<>(map.values());
        return result;
    }
}
