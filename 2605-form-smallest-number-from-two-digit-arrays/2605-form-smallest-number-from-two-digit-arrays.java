class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int[] digits = new int[10];
        
        for (int d : nums1) {
            digits[d]++;
        }
        
        
        for (int d : nums2) {
            digits[d] += 2;
        }
        
        for (int i = 1; i <= 9; i++) {
            if (digits[i] == 3) { // in both arrays
                return i;
            }
        } 
        
        int p1 = 1;
        while (digits[p1] == 0) {
            p1++;
        }
        int p2 = p1 + 1;
        if (digits[p1] == 1) {
            // look for second array
            while (digits[p2] != 2) {
                p2++;
            }
        } else {
            while (digits[p2] != 1) {
                p2++;
            }
        }
        
        return p1 * 10 + p2;
    }
}