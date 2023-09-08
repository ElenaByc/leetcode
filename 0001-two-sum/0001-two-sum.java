class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int[] res = new int[2];
        
        for (int i = 0; i < n; i++) {
            hm.put(target - nums[i], i);
        }
        
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(nums[i]) && hm.get(nums[i]) != i) {
                res[0] = i;
                res[1] = hm.get(nums[i]);
                return res;
            }
        }
        
        return res;
    }
}