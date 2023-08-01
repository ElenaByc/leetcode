class Solution {
    public int missingNumber(int[] nums) {
        int missing = 0;
        int maxNum = 0;
        Set<Integer> numbersSet = new HashSet<>();

        for (int n : nums) {
            numbersSet.add(n);
            if (n > maxNum) {
                maxNum = n;
            }
        }

        for (int i = 0; i <= maxNum; i++) {
            if (!numbersSet.contains(i)) {
                return i;
            }
        }

        return maxNum + 1;
    }
}