class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int[] pair : nums1) {
            hm.put(pair[0], pair[1]);
        }
        
        for (int[] pair : nums2) {
            hm.put(pair[0], hm.getOrDefault(pair[0], 0) + pair[1]);
        }
        
        // System.out.println(hm);
        
        int n = hm.size();
        
        int[][]result = new int[n][2];
        
        int idx1 = 0;
        int idx2 = 0;
        int i = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        while(idx1 < n1 && idx2 < n2) {
            if (nums1[idx1][0] < nums2[idx2][0]) {
                result[i][0] = nums1[idx1][0];
                result[i][1] = hm.get(nums1[idx1][0]);
                idx1++;
            } else if (nums1[idx1][0] > nums2[idx2][0]){
                result[i][0] = nums2[idx2][0];
                result[i][1] = hm.get(nums2[idx2][0]);
                idx2++;
            } else {
                result[i][0] = nums2[idx2][0];
                result[i][1] = hm.get(nums2[idx2][0]);
                idx1++;
                idx2++;
            }
            i++;
        }
        while(idx1 < n1) {
            result[i][0] = nums1[idx1][0];
            result[i][1] = hm.get(nums1[idx1][0]);
            idx1++;
            i++;
        }
        while(idx2 < n2) {
            result[i][0] = nums2[idx2][0];
            result[i][1] = hm.get(nums2[idx2][0]);
            idx2++;
            i++;
        }
        
        return result;
    }
}