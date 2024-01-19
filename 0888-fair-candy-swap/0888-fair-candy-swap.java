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
        
        for (int numA : aliceSizes) {
            for (int numB : bobSizes) {
                if (2 * (numB - numA) == sumB - sumA ) {
                    return new int[] {numA, numB};
                }
            }
        }
        
        return new int[] {0, 0};
    }
}