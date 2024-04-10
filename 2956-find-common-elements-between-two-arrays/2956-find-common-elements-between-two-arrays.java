class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int cnt1 = 0;
        int cnt2 = 0;
        
        var set1 = new HashSet<Integer>();
        for(int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                cnt2++;
            }
        }
        
        var set2 = new HashSet<Integer>();
        for(int num : nums2) {
            set2.add(num);
        }
        for (int num : nums1) {
            if (set2.contains(num)) {
                cnt1++;
            }
        }
        
        return new int[]{cnt1, cnt2};
    }
}