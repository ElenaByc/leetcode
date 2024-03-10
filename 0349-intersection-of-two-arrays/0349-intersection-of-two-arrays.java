class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        for (int num : nums1) {
            if (set2.contains(num)) {
                result.add(num);
            }
        }
        
        int n = result.size();
        int[] res = new int[n];
        List<Integer> list = new ArrayList<>(result);
        for (int i = 0; i < n; i++) {
            res[i] = list.get(i);
        }
        
        return res;
    }
}