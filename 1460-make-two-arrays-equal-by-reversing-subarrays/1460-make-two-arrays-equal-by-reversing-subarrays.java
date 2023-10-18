class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int num : target) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        for (int num : arr) {
            if (hm.containsKey(num)) {
                if (hm.get(num) > 0) {
                    hm.put(num, hm.get(num) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        
        return true;
        
    }
}