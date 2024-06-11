class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001]; // since numbers are from [0, 1000]

        for (int num : arr1) {
            count[num]++;
        }

        int i = 0;
        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[i] = num;
                i++;
                count[num]--;
            }
        }

        // For remaining elements that were not in arr2
        for (int j = 0; j < 1001; j++) {
            while (count[j] > 0) {
                arr1[i] = j;
                i++;
                count[j]--;
            }
        }

        return arr1;
    }
}