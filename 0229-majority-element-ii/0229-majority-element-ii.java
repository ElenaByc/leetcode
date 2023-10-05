class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int limit = n / 3;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        for (int num : hm.keySet()) {
            if(hm.get(num) > limit) {
                result.add(num);
            }
        }
        
        return result;
    }
}