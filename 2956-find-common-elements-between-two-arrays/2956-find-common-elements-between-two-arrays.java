class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int cnt1 = 0;
        int cnt2 = 0;
        
        int[] arr = new int[101];
        for(int num : nums1) {
            arr[num]++;
        }
        for (int num : nums2) {
            if (arr[num] > 0) {
                cnt2++;
            }
        }
        
        arr = new int[101];
        for(int num : nums2) {
            arr[num]++;
        }
        for (int num : nums1) {
            if (arr[num] > 0) {
                cnt1++;
            }
        }
        
        return new int[]{cnt1, cnt2};
    }
}