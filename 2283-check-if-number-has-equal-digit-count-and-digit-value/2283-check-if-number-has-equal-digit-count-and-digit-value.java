class Solution {
    public boolean digitCount(String num) {
        int[] count = new int[10];
        int n = num.length();
        int digit;
        for (int i = 0; i < n; i++) {
            digit = num.charAt(i) - '0';
            count[digit]++;
        }
        // System.out.println(Arrays.toString(count));
        
        for (int i = 0; i < n; i++) {
            digit = num.charAt(i) - '0';
            if (digit != count[i]) {
                return false;
            }
        }
        
        return true;
        
    }
}