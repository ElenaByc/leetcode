class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char ch;
        
        for (int i = 0; i  < moves.length(); i++) {
            ch = moves.charAt(i);
            switch (ch) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
            }
        }
        
        return (x == 0 & y == 0);
    }
}