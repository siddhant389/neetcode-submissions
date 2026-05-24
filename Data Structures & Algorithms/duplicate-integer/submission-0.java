class Solution {
    public boolean hasDuplicate(int[] nums) {
        
            Set<Integer> numsSet = new HashSet();

            Arrays.stream(nums).boxed().forEach(numsSet::add);

            if(numsSet.size() < nums.length) return true;

            return false; 
    }
}