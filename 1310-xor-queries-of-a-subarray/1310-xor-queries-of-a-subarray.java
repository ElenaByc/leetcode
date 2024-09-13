class Solution {

    public int[] xorQueries(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < arr.length; ++i) {
            arr[i] ^= arr[i - 1];
        }
        
        for (int[] q : queries) {
            if (q[0] > 0) {
                result.add(arr[q[0] - 1] ^ arr[q[1]]);
            } else {
                result.add(arr[q[1]]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}