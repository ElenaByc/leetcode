class Solution {
    public int findMaxK(int[] nums) {
        int maxNum = -1;
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
            if (set.contains(-num) && Math.abs(num) > maxNum) {
                maxNum = Math.abs(num);
            } 
        }
                
        return maxNum;
    }
}