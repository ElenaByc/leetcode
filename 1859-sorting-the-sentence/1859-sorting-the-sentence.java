class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];
        StringBuilder sb = new StringBuilder();
        int num;
        
        for (String str: arr) {
            num = Character.getNumericValue(str.charAt(str.length() - 1));
            result[num - 1] = str.substring(0, str.length() - 1);
        }
        
         for (int i = 0; i < result.length; i++) {
             sb.append(result[i]);
             if (i < result.length - 1) {
                 sb.append(" ");
             }
         }
        
        return sb.toString();
    }
}