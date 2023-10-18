class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;
        int[] result = new int[m];  
        Arrays.sort(nums);
        for (int i = 0; i < m; i++) {
            result[i] = calcMaxSize(nums, queries[i]);
        }
        
        return result;
    }
    
    public int calcMaxSize(int[] nums, int limit) {
        int size = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= limit) {
                sum += nums[i];
                size++;
            } else {
                return size;
            }
        }
        return size;
    }
}