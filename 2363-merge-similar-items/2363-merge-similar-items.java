class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> list;
        
        for (int[] pair : items1) {
            hm.put(pair[0], hm.getOrDefault(pair[0], 0) + pair[1]);
        }

        for (int[] pair : items2) {
            hm.put(pair[0], hm.getOrDefault(pair[0], 0) + pair[1]);
        }
        
        Set<Integer> keys = hm.keySet();
        Integer[] array = keys.toArray(new Integer[keys.size()]);
        Arrays.sort(array);

        for (int num : array) {
            list = new ArrayList<>();
            list.add(num);
            list.add(hm.get(num));
            resultList.add(list);
        }

        return resultList;
    }
}