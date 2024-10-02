class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr;
        
        TreeSet<Integer> nums = new TreeSet<>();
        for (int num : arr) {
            nums.add(num);
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int num : nums) {
            map.put(num, rank);
            rank++;
        }
             
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }
        
        return arr;
        
    }
}