class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[1000001];
        int cnt = 0;
        
        for (int num : nums2) {
            arr[num]++;
        }


        for (int i = 0; i < n; i++) {
            if (nums1[i] % k != 0) {
                continue;
            }
            int num = nums1[i] / k;
            for (int j = 1; j * j <= num; j++) {
                if (num % j == 0) {
                    cnt += arr[j];
                    if (num / j != j) {
                        cnt += arr[num / j];
                    }
                }
            }
        }
        return cnt;
    }
}