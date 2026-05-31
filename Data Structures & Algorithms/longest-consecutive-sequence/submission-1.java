class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int n: nums) {
            set.add(n);
        }

        int longest =0;
        int length;

        for(int n: nums) {
            length = 0;
            if(!set.contains(n-1)) length++;
            else continue;
            while(set.contains(n+1)) {
                length++;
                n++;
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
}
