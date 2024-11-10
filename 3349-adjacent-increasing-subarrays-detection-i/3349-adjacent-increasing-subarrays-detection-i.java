class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1) {
            return true;
        }
        
        boolean inc1, inc2;
        int n = nums.size();
        int num;
        
        for (int i = 0; i < n - 2 * k + 1; i++) {
            num = nums.get(i);
            inc1 = true;
            inc2 = true;
            for (int j = 1; j < k; j++) {
                // System.out.println("num = " + num + " nums.get(i + j) = " + nums.get(i + j));
                if (nums.get(i + j) <= num) {
                    inc1 = false;
                    break;
                } 
                num = nums.get(i + j);
            }

            // System.out.println("i = " + i + " inc1 = " + inc1);
            if (!inc1) {
                continue;
            }
            num = nums.get(i + k);
            for (int j = 1; j < k; j++) {
                // System.out.println("num = " + num + " nums.get(i + k - 1 + j) = " + nums.get(i + k + j));
                if (nums.get(i + k + j) <= num) {
                    inc2 = false;
                    break;
                } 
                num = nums.get(i + k + j);
            }
            // System.out.println("i = " + i + " inc2 = " + inc2);
            if (inc2) {
                return true;
            }
        }
        
        return false;
    }
}