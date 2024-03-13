class Solution {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        if (area % w == 0) {
            return new int[]{area / w, w};
        }
        while (w > 0 && area % w != 0) {
            w--;
        }
        return new int[]{area / w, w};
    }
}