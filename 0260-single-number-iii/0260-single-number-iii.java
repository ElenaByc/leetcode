class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] result = new int[2];
        
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        
        int i = 0;
        for (Integer num : set) {
            result[i] = num;
            i++;
        }
        
        return result;
    }
}