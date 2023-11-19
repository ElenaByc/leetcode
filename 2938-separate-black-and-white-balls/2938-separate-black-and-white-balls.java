class Solution {
    public long minimumSteps(String s) {
        long steps = 0;
        int lastNonZeroIdx = 0;
      
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                steps += i - lastNonZeroIdx;
                lastNonZeroIdx++;
            }
        }
        
        return steps;
        
    }
}