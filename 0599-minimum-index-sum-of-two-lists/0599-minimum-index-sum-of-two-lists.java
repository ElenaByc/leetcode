class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hm = new HashMap<>();
        List<String> list = new ArrayList<>();
        int min = list1.length + list2.length;
        
        for(int i = 0; i < list2.length; i++) {
            hm.put(list2[i], i);
        }
        
        for(int i = 0; i < list1.length; i++) {
            if (hm.containsKey(list1[i])) {
                if (min > hm.get(list1[i]) + i) {
                    min = hm.get(list1[i]) + i;
                    list.clear();
                    list.add(list1[i]);
                } else if (min == hm.get(list1[i]) + i) {
                    list.add(list1[i]);
                }
            }
        }
        
        
        String[] result = new String[list.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}