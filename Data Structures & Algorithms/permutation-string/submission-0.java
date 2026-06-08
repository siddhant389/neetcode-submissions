class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int i = 0;
        int j = s1.length()-1;
        char[] input = s1.toCharArray();
        Arrays.sort(input);
        String sortedInput = new String(input);
        
        while ( j < s2.length()){
           String str = s2.substring(i, j+1);
           char[] ch = str.toCharArray();
           Arrays.sort(ch);

           String sorted = new String(ch);
           if(sorted.equals(sortedInput)) return true;
           i++;
           j++;
        }
        return false;
    }
}
