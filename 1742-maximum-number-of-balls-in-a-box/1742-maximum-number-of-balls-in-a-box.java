class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        // Since the range is 1 ~ 100_000, 
        // the biggest possible non-empty box number 
        // is 9 + 9 + 9 + 9 + 9 = 45, which corresponds to ball 99999
        int[] count = new int[46];
        int boxNumber;
        int maxNumberOfBalls = 0;
        
        for (int i = lowLimit; i <= highLimit; i++) {
            boxNumber = calculateBoxNumber(i);
            count[boxNumber]++;
            maxNumberOfBalls = Math.max(maxNumberOfBalls, count[boxNumber]);
        }

        return maxNumberOfBalls;
    }
    
    public int calculateBoxNumber(int ballNumber) {
        int boxNumber = 0;
        while (ballNumber > 0) {
            boxNumber += ballNumber % 10;
            ballNumber /= 10;
        }
        
        return boxNumber;
    } 
}