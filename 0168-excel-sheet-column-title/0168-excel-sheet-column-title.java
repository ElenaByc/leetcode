class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        columnNumber--;
        while (columnNumber > 25) {
            sb.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
            columnNumber--;
        }
        sb.append((char)(columnNumber + 'A'));
        return sb.reverse().toString();
    }
}