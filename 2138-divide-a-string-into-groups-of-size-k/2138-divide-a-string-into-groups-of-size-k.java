class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int groupsNum = n / k;
        int rem = n % k;
        if (rem != 0) {
            groupsNum++;
        }
        String[] groups = new String[groupsNum];
        
        for (int i = 0; i < groupsNum; i++) {
            if (i == groupsNum - 1 && rem != 0) {
                groups[i] = s.substring(i * k) + String.valueOf(fill).repeat(k - rem);
            } else {
                groups[i] = s.substring(i * k, (i + 1) * k);
            }
        }
        
        
        return groups;
    }
}