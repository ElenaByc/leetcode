class Solution {
    public void duplicateZeros(int[] arr) {
        int zeroCnt = 0;
        int n = arr.length;
        boolean doNotDoubleLastZero = false;
        for (int i = 0; i < n - zeroCnt; i++) {
            if (arr[i] == 0 && i < n - zeroCnt - 1) { // cannot double last zero, so do not count it
                zeroCnt++;
            } else if (arr[i] == 0 && i == n - zeroCnt - 1) {
                 doNotDoubleLastZero = true;
            }
        }
        // System.out.println(zeroCnt);
        int idx = n - zeroCnt - 1;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = arr[idx];
            if(arr[idx] == 0 && (idx != n - zeroCnt - 1 || !doNotDoubleLastZero)) {
                i--;
                arr[i] = arr[idx];
            }
            idx--;
        }
    }
}