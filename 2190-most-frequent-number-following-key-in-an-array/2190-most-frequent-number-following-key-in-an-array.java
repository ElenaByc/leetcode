class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int max = 0;
        int target = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == key && i < n - 1) {
                hm.put(nums[i+1], hm.getOrDefault(nums[i+1], 0) + 1);
                if (max < hm.get(nums[i+1])) {
                    max = hm.get(nums[i+1]);
                    target = nums[i+1];
                }
            }
        }
        
        // System.out.println(hm);
        
        return target;
    }
}