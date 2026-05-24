class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

       String sortedS = s.chars()
                         .sorted()
                         .mapToObj(c -> String.valueOf(c))
                         .collect(Collectors.joining());
        String sortedT = t.chars()
                         .sorted()
                         .mapToObj(c -> String.valueOf(c))
                         .collect(Collectors.joining());


        if(sortedS.equals(sortedT)) return true;
        return false;
    }
}
