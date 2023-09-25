class Solution {
    public char findTheDifference(String s, String t) {
        int dif = 0;
        for (int i = 0; i < s.length(); i++) {
		    dif += t.charAt(i) - s.charAt(i);
        }
        return (char)(t.charAt(s.length()) + dif); 
    }
}