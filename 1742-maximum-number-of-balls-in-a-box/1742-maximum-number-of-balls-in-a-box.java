class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int boxNumber;
        int maxNumberOfBalls = 0;
        
        for (int i = lowLimit; i <= highLimit; i++) {
            boxNumber = calculateBoxNumber(i);
            hm.put(boxNumber, hm.getOrDefault(boxNumber, 0) + 1);
        }
        
        for (int numberOfBalls : hm.values()) {
            if (numberOfBalls > maxNumberOfBalls) {
                maxNumberOfBalls = numberOfBalls;
            }
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