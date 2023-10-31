class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result  = new ArrayList<>();
        List<Integer> list;
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i-1]);
        }
        
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i-1] == minDiff) {
                list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                result.add(list);
            }
        }
        
        return result;
    }
}