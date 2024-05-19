class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] q) {
        int n = nums.length;
        int m = q.length;
        boolean[] ans = new boolean[m];
        int[] arr = new int[n]; 
        int cnt = 0;
    
        for (int i = 1; i < n; i++) {
            if(nums[i] % 2 == nums[i-1] % 2) {
                cnt++;
            }
            arr[i] = cnt;
        }

        if (cnt == 0) {
            Arrays.fill(ans, true);
            return ans;
        }
        
        for (int i = 0; i < m; i++) {
            int q0 = q[i][0];
            int q1 = q[i][1];
            ans[i] = arr[q0] == arr[q1];
        }
        
        return ans;
    }
    
    
}


     