class Solution {
    public boolean squareIsWhite(String coordinates) {
        String letters = "abcdefgh";
        char letter = coordinates.charAt(0);
        int num = coordinates.charAt(1) - '0';
        
        return letters.indexOf(letter) % 2 == num % 2;
    }
}