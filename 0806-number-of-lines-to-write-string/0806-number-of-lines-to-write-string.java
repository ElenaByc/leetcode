class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int numOfLines = 1;
        int currentLine = 0;
        char ch;
        int width;
        
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            width = widths[ch - 'a'];
            if (currentLine + width > 100) {
                // System.out.println(s.substring(0, i));
                numOfLines++;
                currentLine = 0;
            }
            currentLine += width;
            // System.out.println(ch + " " + currentLine);
        }
        
        return new int[] {numOfLines, currentLine};
    }
}