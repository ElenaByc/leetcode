class Solution {
    public String largestGoodInteger(String num) {
        String str;
        
        for (int i = 9; i >= 0; i--) {
            str = (Integer.toString(i)).repeat(3);
            if(num.indexOf(str) != -1) {
                return str;
            }
        }
        
        return "";
    }
}