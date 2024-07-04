class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int rem = 0;
        int n = nums.length;
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rem = (2 * rem + nums[i]) % 5;
            if (rem == 0) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        
        return list;
    }
}