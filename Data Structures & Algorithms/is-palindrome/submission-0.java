class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        for(char ch: s.toCharArray()) {
            if((ch >= 'A' && ch <= 'Z') || 
            (ch >= 'a' && ch <= 'z') ||
            (ch >= '0' && ch <= '9')) str.append(Character.toLowerCase(ch));
        }

        int i=0;
        int j= str.length()-1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
