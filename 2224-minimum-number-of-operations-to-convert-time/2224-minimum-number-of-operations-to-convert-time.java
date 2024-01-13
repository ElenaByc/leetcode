class Solution {
    public int convertTime(String current, String correct) {
        int currentMin = Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3));
        int correctMin = Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3));
        
        int dif = correctMin - currentMin;
        int result = 0;
        result += dif / 60;
        dif %= 60;
        result += dif / 15;
        dif %= 15;
        result += dif / 5;
        dif %= 5;
        result += dif;
        
        
        return result;
    }
}