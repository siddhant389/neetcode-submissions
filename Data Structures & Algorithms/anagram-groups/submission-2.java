class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      HashMap<String, List<String>> map = new HashMap<>();

      for(int i=0; i < strs.length; i++) {
        int[] countLetters = new int[26];
        for(char c : strs[i].toCharArray()){
          countLetters[c - 'a']++;
        }
        String key = Arrays.toString(countLetters);
        if(map.containsKey(key)) {
          map.get(key).add(strs[i]);
        } else {
          map.put(key, new ArrayList<>(List.of(strs[i])));
        }
      }

      return new ArrayList<>(map.values());
        
    }
}
