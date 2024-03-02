class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return new int[]{nums[0] * nums[0]};
        }
        int[] result = new int[n];
        int posIdx = n; // index of first non negative number
        for (int i = 0; i < n; i++) {
            if (posIdx == n && nums[i] >=0) {
                posIdx = i;
            } 
            nums[i] *= nums[i];
        }
        if (posIdx == 0) { // all numbers >= 0
            return nums;
        }
        if (posIdx == n) { // all numbers negative
            for (int i = 0; i < n; i++) {
                result[n - i - 1] = nums[i];
            }
            return result;
        } 
        
        // merge two sorted parts
        int negIdx = posIdx - 1;
        int i = 0;
        while (negIdx >= 0 && posIdx < n) {
            if (nums[negIdx] < nums[posIdx]) {
                result[i] = nums[negIdx];
                negIdx--;
            } else {
                result[i] = nums[posIdx];
                posIdx++;
            }
            i++;
        }
        while (negIdx >= 0) {
            result[i] = nums[negIdx];
            negIdx--;
            i++;
        }
        
        while (posIdx < n) {
            result[i] = nums[posIdx];
            posIdx++;
            i++;
        }
        
        return result;
    }
}