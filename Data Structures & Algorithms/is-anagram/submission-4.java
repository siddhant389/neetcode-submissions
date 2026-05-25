class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.merge(c, 1, Integer::sum);
        }

        for (char c : t.toCharArray()) {
            Integer val = count.get(c);
            if (val == null) return false;

            if (val == 1) {
                count.remove(c);
            } else {
                count.put(c, val - 1);
            }
        }

        return true;
    }
}