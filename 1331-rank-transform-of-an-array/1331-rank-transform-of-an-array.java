class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        Arrays.sort(arr);
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            if (!hm.keySet().contains(arr[i])) {
                hm.put(arr[i], cnt);
                cnt++;
            }
        }
        for (int i = 0; i < n; i++) {
            result[i] = hm.get(result[i]);
        }
        
        return result;
    }
}