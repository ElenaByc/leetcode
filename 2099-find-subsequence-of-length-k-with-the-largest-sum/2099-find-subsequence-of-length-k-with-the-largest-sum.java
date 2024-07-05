class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        int[] ans = new int[k];
        
        for (int i = 0; i < n; i++) {
            arr[i] = new int[] {nums[i], i};
        }
        Arrays.sort(arr, new Comparator<int[]>() {
          @Override
          public int compare(int[] p1, int[] p2) {
            return Integer.compare(p1[0], p2[0]); // Compare by first element
          }
        });
        System.out.println(Arrays.deepToString(arr));
        int[][] arr2 = new int[k][2];
        for (int i = 0; i < k; i++) {
            arr2[i] = arr[n - 1 - i];
        }
        Arrays.sort(arr2, new Comparator<int[]>() {
          @Override
          public int compare(int[] p1, int[] p2) {
            return Integer.compare(p1[1], p2[1]); // Compare by second element
          }
        });
        System.out.println(Arrays.deepToString(arr2));
        for (int i = 0; i < k; i++) {
            ans[i] = arr2[i][0];
        }
        
        return ans;
    }
}