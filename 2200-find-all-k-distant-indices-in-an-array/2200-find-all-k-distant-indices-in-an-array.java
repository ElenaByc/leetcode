class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int lastAddedIdx = -1;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                for (int j = Math.max(i - k, lastAddedIdx + 1); j <= Math.min(i + k, n - 1); j++) {
                    list.add(j);
                }
                lastAddedIdx = i + k;
            }
        }
        
        return list;
    }
}