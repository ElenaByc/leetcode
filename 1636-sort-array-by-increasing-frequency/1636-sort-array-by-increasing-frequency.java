class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int[] result = new int[n];
        
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        HashMap<Integer, List<Integer>> hm2= new HashMap<>();
        int val;
        List<Integer> list;
        for (int num : hm.keySet()) {
            val = hm.get(num);
            if (hm2.containsKey(val)) {
                list = hm2.get(val);
            } else {
                list = new ArrayList<>();
            }
            list.add(num);
            hm2.put(val, list);
        }
        List<Integer> freqList = new ArrayList<>();
        
        for (int freq : hm2.keySet()) {
            freqList.add(freq);
        }
        Collections.sort(freqList);

        int i = 0;
        for (int freq : freqList) {
            list = hm2.get(freq);
            Collections.sort(list, Collections.reverseOrder());
            for (int num : list) {
                for (int j = 0; j < freq; j++) {
                    result[i] = num;
                    i++;
                }
            }
        }
        
        return result;
        
    }
}