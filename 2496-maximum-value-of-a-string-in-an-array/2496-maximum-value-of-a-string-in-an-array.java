class Solution {
    public int maximumValue(String[] strs) {
        int maxVal = 0;
        
        for (String s : strs) {
            maxVal = Math.max(maxVal, getVal(s));
        }
        
        return maxVal;
    }
    
    public int getVal(String s) {
        int val;
        try {
            val = Integer.valueOf(s);
        } catch (Exception e) {
            val = s.length();
        }
        return val;
    }
}