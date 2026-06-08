class Solution {
    public String getKey(String str) {
        int[] arr = new int[26];
        for(char ch: str.toCharArray()){
            arr[ch - 'a']++;
        }
        StringBuilder key = new StringBuilder();
        for(int n : arr) {
            key.append(n);
        }

        return key.toString();
    }
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()) return false;
        String key = getKey(s1);
        int i=0, j = s1.length()-1;

        while(j < s2.length()) {
            String window = s2.substring(i,j+1);
            String windowKey = getKey(window);
            if(windowKey.equals(key)) return true;
            i++;
            j++;
        }
        return false;
    }
}
