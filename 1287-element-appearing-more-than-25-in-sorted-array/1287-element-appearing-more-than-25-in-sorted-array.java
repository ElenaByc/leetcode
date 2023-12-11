class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        double quarter = n / 4.0;
        
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
            if (hm.get(num) > quarter) {
                return num;
            }
        }
        
        return 0;
    }
}