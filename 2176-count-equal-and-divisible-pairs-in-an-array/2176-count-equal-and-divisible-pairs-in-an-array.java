class Solution {
    public int countPairs(int[] nums, int k) {
        HashMap <Integer, ArrayList<Integer>> hm = new HashMap<>();
        int n = nums.length;
        ArrayList<Integer> list;
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(nums[i])) {
                hm.get(nums[i]).add(i);
            } else {
                list = new ArrayList<>();
                list.add(i);
                hm.put(nums[i], list);
            }
        }
        
        for (int num : hm.keySet()) {
            list = hm.get(num);
            n = list.size();
            if (n > 1) {
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (list.get(i) * list.get(j) % k == 0) {
                            // System.out.println(list.get(i) + ", " + list.get(j));
                            result++;
                        }
                    }
                }
            }
        }
        
        return result;
    }
}