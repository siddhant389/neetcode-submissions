class Solution {
    public int characterReplacement(String s, int k) {

      HashSet<Character> set = new HashSet<>();
      int result = 0;

      for(char c : s.toCharArray()) {
        set.add(c);
      }

      for( char c : set) {
        int count = 0;
        int left = 0;
        for(int right=0; right < s.length(); right++){
            if(s.charAt(right) == c) count++;
            while ((right - left + 1) - count > k) {
                    if (s.charAt(left) == c) {
                        count--;
                    }
                    left++;
                }

            result = Math.max(result, right - left + 1);
        }
      }
      return result;
    }
}
