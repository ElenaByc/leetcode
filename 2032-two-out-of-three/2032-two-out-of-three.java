class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] cnt = new int[101];
        Set<Integer> set = new HashSet<>(); 
        
        for (int num : nums1) {
            cnt[num] = 1;
        }
        for (int num : nums2) {
            if (cnt[num] == 1) { 
                set.add(num);
            } else {
                cnt[num] = 2;
            }
        }
        
        for (int num : nums3) {
            if (cnt[num] != 0) { 
                set.add(num);
            }
        }
        
        return new ArrayList<>(set);
    }
}