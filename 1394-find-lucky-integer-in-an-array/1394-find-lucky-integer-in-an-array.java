class Solution {
    public int findLucky(int[] arr) {
        // HashMap<Integer, Integer> hm = new HashMap<>();
        int[] nums = new int[501];
        
        for (int num : arr) {
            // hm.put(num, hm.getOrDefault(num, 0) + 1);
            nums[num]++;
        }
        
        int largest = -1;
        
        // for (int key : hm.keySet()) {
        for (int i = 1; i <= 500; i++) {
            if (i == nums[i] && i > largest) {
                largest = i;
            }
        }
        
        return largest;
    }
}