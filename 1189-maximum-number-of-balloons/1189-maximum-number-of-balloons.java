class Solution {
    public int maxNumberOfBalloons(String text) {
        int countA = 0;
        int countB = 0;
        int countL = 0;
        int countO = 0;
        int countN = 0;
        
        for (int i = 0; i < text.length(); i++) {
            switch(text.charAt(i)) {
                case 'a':
                    countA++;
                    break;
                case 'b':
                    countB++;
                    break;
                case 'l':
                    countL++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'n':
                    countN++;
                    break;
            }
        }
        
        return Math.min(countA, Math.min(countB, Math.min(countL / 2, Math.min(countO /2, countN))));
    }
}