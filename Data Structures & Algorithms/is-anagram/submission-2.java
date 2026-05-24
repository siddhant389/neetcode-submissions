class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

       String sortedS = s.codePoints()
                         .sorted()
                         .mapToObj(c -> String.valueOf(c))
                         .collect(Collectors.joining());
        String sortedT = t.codePoints()
                         .sorted()
                         .mapToObj(c -> String.valueOf(c))
                         .collect(Collectors.joining());


        if(sortedS.equals(sortedT)) return true;
        return false;
    }
}
