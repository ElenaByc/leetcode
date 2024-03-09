class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums2) {
            set.add(num);
        }
        
        for (int num : nums1) {
            if (set.contains(num)) {
                return num;
            }
        }
        
        return -1;
    }
}