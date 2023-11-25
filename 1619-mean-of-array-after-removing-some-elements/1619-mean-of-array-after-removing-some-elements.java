class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        int remove = n / 20;
        Arrays.sort(arr);
        
        double mean = 0;
        for (int i = remove; i < n - remove; i++) {
            mean += arr[i];
        }
        mean /= (n - 2 * remove);

        return mean;
    }
}