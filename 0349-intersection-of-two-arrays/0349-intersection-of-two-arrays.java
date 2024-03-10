class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] nums = new boolean[1001];
        for (int num : nums1) {
            nums[num] = true;
        }
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums2) {
            if (nums[num]) {
                list.add(num);
                nums[num] = false;
            }
        }
        int n = list.size();
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            res[i] = list.get(i);
        }
        
        return res;
    }
}