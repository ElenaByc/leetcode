class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean good = false;
        char prevChar;
        
        while(!good && sb.length() > 0) {
            prevChar = sb.charAt(0);
            good = true;
            for (int i = 1; i < sb.length(); i++) {
                if (Math.abs(prevChar - sb.charAt(i)) == 32) {
                    good = false;
                    sb.delete(i - 1, i + 1);
                    break;
                } else {
                    prevChar = sb.charAt(i);
                }
            }
        }
        
        return sb.toString();
    }
}