class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001; //arr[i] <= 10000
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++) {
            arr[i] %= 10001;
        }
        
        return arr;
    }
}