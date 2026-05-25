class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      HashMap<String, List<String>> map = new HashMap<>();

      for(int i=0; i < strs.length; i++) {
        char[] ch = strs[i].toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);
        if(map.containsKey(sorted)) {
          map.get(sorted).add(strs[i]);
        } else {
          map.put(sorted, new ArrayList<>(List.of(strs[i])));
        }
      }

      return new ArrayList<>(map.values());
        
    }
}
