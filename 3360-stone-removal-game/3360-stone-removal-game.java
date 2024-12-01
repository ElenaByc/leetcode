class Solution {
    public boolean canAliceWin(int n) {
        int num = 10;
        
        while (n > 0) {
            // Alice's turn
            if (n - num < 0) {
                return false;
            }  
            n -= num;
            num--;
            // Bob's turn
            if (n - num < 0) {
                return true;
            }  
            n -= num;
            num--;
        }
        
        return false;
    }
}