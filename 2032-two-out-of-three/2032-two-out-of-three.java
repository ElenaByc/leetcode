class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean[] cnt = new boolean[101];
        Set<Integer> set = new HashSet<>(); 
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            cnt[num] = true;
        }
        for (int num : nums2) {
            set2.add(num);
        }
        for (int num : set2) {
            if (cnt[num]) { 
                set.add(num);
            } else {
                cnt[num] = true;
            }
        }
        
        for (int num : nums3) {
            if (cnt[num]) { 
                set.add(num);
            }
        }
        
        return new ArrayList<>(set);
    }
}