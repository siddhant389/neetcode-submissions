class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for(String s : strs) {
            str.append((char) ('a' + s.length()));
        }
        str.append("\u241F");
        for(String s: strs) {
            StringBuilder temp = new StringBuilder(s);
            str.append(temp.reverse());
        }

        return str.toString();

    }

    public List<String> decode(String str) {
       
       System.out.println(str);
       List<String> decoded = new ArrayList<>();
       String[] strs = str.split(java.util.regex.Pattern.quote("\u241F"));
       
       if(strs.length == 0) return decoded;
       
       String first = strs[0];
       if(strs.length == 1) {
        for( int i=0; i< strs[0].length(); i++){
            decoded.add("");
        }
        return decoded;
       }
       String second = strs[1];
       int listSize = first.length();

        for(int i=0,j=0; i < first.length() && j <= second.length(); i++){

            int length = (int)(first.charAt(i) - 'a');
            StringBuilder temp = new StringBuilder(second.substring(j, j+ length));
            decoded.add(temp.reverse().toString());
            j = j+length;     
        }

        return decoded;

    }
}
