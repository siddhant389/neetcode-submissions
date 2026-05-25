class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        char[] ch = s.toCharArray();

        for(int i=0; i < ch.length; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
        }

        char[] chT = t.toCharArray();
        for(int i=0; i < chT.length; i++) {
            if(!map.containsKey(chT[i])) return false;

             map.put(chT[i], map.get(chT[i])-1);
        }

        for(int i=0; i < chT.length; i++) {
            if(map.get(chT[i]) != null && map.get(chT[i]) == 0) map.remove(chT[i]);
            else if (map.containsKey(chT[i])) return false;
        }

        if(map.size() == 0) return true;
        return false;
        
    }
}
