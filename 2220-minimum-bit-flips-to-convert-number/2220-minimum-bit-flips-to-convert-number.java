class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int counter = 0;
        //count number of 1 
        while (xor != 0) {
            if (xor % 2 != 0) {
                counter++;
            }
            xor /= 2;
        }
        return counter;
    }
}