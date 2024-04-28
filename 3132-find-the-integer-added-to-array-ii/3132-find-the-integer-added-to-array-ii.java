class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int x = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                int idx = 0;
                int dif = Integer.MAX_VALUE;
                boolean valid = true;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    if (idx == 0 ) {
                        dif = nums2[idx] - nums1[k];
                        idx++;
                    } else {
                        if ((nums2[idx] - nums1[k]) != dif ) {
                            valid = false;
                            break;
                        }
                        idx++;
                    }
                }
                if (valid) {
                    x = Math.min(x, dif);
                }
            }
        }
        
        return x;
    }
}