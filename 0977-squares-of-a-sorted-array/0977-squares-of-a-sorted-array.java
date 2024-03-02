class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return new int[]{nums[0] * nums[0]};
        }
        List<Integer> positive0 = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        
        for (int num : nums) {
            if (num < 0) {
                negative.add(num * num);
            } else {
                positive0.add(num * num);
            }
        }
        // merge two sorted lists
        int[] result = new int[n];
        int n1 = negative.size();
        int n2 = positive0.size();
        int i1 = n1 - 1;
        int i2 = 0;
        int i = 0;
        while (i1 >= 0 && i2 < n2) {
            if (positive0.get(i2) <= negative.get(i1)) {
                result[i] = positive0.get(i2);
                i2++;
            } else {
                result[i] = negative.get(i1);
                i1--;
            }
            i++;
        }
        while (i1 >= 0) {
            result[i] = negative.get(i1);
            i1--;
            i++;
        }
        
        while (i2 < n2) {
            result[i] = positive0.get(i2);
            i2++;
            i++;
        }
        
        return result;
    }
}