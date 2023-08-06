class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        boolean[] arr = new boolean[201];
        Arrays.fill(arr, false);
        int counter = 0;
        for (int n : nums) {
            if (n >= 2 * diff) {
                if (arr[n - diff] && arr[n - 2* diff]) counter++;
            }
            arr[n] = true;
        }
        return counter;
    }
}