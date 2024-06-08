class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = nums[i];
        }
        Arrays.sort(sorted);
        

        int i = 0;
        
        while (i < n) {
            while (i < n && sorted[0] != nums[i]) {
                i++;
            }
            if (i == n) {
                return false;
            }
            // System.out.println("i = " + i);
            boolean valid = true;
            int j = i + 1;
            if (j == n) {
                j = 0;
            }
            for (int k = 1; k < n; k++) {
                if (nums[j] != sorted[k]) {
                    valid = false;
                    break;
                }
                j++;
                if (j == n) {
                    j = 0;
                }
            }
            if (valid) {
                return true;
            }
            i++;
        }
        return false;
    }
}