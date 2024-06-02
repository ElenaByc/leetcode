class Solution {
    public int minimumChairs(String s) {
        int max = 0;
        int chairs = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                chairs++;
            } else {
                chairs--;
            }
            max = Math.max(chairs, max);
        }

        return max;
    }
}