class Solution {
    public int lengthOfLongestSubstring(String s) {

        LinkedHashSet<Character> hashQueue = new LinkedHashSet<>();
        int longest = 0;
        for(int i =0; i < s.length(); i++) {
            if(hashQueue.contains(s.charAt(i))) {
                Character head = hashQueue.iterator().next();
                while( head != s.charAt(i)) {
                    hashQueue.remove(head);
                    head = hashQueue.iterator().next();
                }
                hashQueue.remove(head);
                hashQueue.add(s.charAt(i));
            } else {
                hashQueue.add(s.charAt(i));
            }
            longest = Math.max(longest, hashQueue.size());
        }
        
        return longest;
    }
}
