class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        for (int num : aliceSizes) {
            sumA += num;
        }
        for (int num : bobSizes) {
            sumB += num;
        }
        Set<Integer> set = new HashSet<>();  
        int target = (sumA - sumB) / 2;
        
        for (int numA : aliceSizes) {
            set.add(numA - target);
        }
        
        for (int numB : bobSizes) {
            if (set.contains(numB)) {
                return new int[] {target + numB, numB};
            }
        }
        
        return new int[] {0, 0};
    }
}