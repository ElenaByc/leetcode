class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] leftP = new int[n];
        int[] rightP = new int[n];

        leftP[0] = 1;
        rightP[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            leftP[i] = leftP[i - 1] * nums[i - 1];
            rightP[n - 1 - i] = rightP[n - i] * nums[n - i];
        }

        for (int i = 0; i < n; i++) {
            result[i] = leftP[i] * rightP[i];
        }


        return result;
    }
}