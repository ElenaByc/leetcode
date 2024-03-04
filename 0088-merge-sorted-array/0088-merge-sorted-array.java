class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = 0;
        int i2 = 0;
        int i = 0;
        int[] result = new int[n + m];
        
        while (i1 < m && i2 < n) {
            if (nums1[i1] <= nums2[i2]) {
                result[i] = nums1[i1];
                i1++;
            } else {
                result[i] = nums2[i2];
                i2++;
            }
            i++;
        }
        
        while (i1 < m) {
            result[i] = nums1[i1];
            i1++;
            i++;
        }
        
        while (i2 < n) {
            result[i] = nums2[i2];
            i2++;
            i++;
        }
        
        for (i = 0; i < n + m; i++) {
            nums1[i] = result[i];
        }
    }
}