class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] namesSorted = new String[n];
        HashMap<Integer, String> hm = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            hm.put(heights[i], names[i]);
        }
        
        Arrays.sort(heights);
        
        for (int i = 0; i < n; i++) {
             namesSorted[i] = hm.get(heights[n - 1 - i]);
        }
        
        return namesSorted;
    }
}