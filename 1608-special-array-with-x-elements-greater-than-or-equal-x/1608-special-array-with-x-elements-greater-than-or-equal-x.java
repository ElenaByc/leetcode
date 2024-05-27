class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            int cnt = 0;
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[j] >= i) {
                    cnt++;
                    if (cnt > i) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (cnt == i) {
                return i;
            } 
        }
        return -1;
    }
}