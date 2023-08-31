class Solution {
    public int pivotInteger(int n) {
        double x = Math.sqrt((n * n + n) / 2);
        int pivot = (int) x;
        if (x - pivot > 0) {
            return -1;
        }
        return pivot;
    }
}