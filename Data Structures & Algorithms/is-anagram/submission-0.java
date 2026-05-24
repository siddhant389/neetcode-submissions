class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        String sortedS = new String(charS);

        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        String sortedT = new String(charT);

        if(sortedS.equals(sortedT)) return true;
        return false;
    }
}
