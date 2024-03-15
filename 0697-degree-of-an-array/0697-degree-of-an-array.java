class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        int n = nums.length;
        int deg = n;
        int max = 0;
        List<Integer> list;
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(nums[i])) {
                list = hm.get(nums[i]);
            } else {
                list = new ArrayList<>();
            }
            list.add(i);
            max = Math.max(max, list.size());
            hm.put(nums[i], list);
        }
        
        for (int num : hm.keySet()) {
            list = hm.get(num);
            if (list.size() == max) {
                deg = Math.min(deg, list.get(max-1) - list.get(0) + 1);
            }
        }
        
        
        return deg;
    }
}