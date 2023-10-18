class Solution {
    public int maximumValue(String[] strs) {
        int maxVal = 0;
        
        for (String s : strs) {
            maxVal = Math.max(maxVal, getVal2(s));
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
    
    public int getVal2(String s) {
        int val;
        boolean hasLetter = false;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') { // letter
                hasLetter = true;
                break;
            }
        }
        if (hasLetter) {
            val = s.length();
        } else {
            val = Integer.valueOf(s);
        } 
        return val;
    }
}