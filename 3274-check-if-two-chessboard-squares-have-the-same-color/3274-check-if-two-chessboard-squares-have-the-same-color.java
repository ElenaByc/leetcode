class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int letter = c1.charAt(0) - 'a' + 1;
        int num = c1.charAt(1) - '0';
        
        int color1 = (letter + num) % 2; 
            
        letter = c2.charAt(0) - 'a' + 1;
        num = c2.charAt(1) - '0';
        int color2 = (letter + num) % 2; 
        
            
        return color1 == color2;
    }
}