class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> hm = new HashMap<>();
        
        for (List<String> list : paths) {
            hm.put(list.get(0), list.get(1));
        }
        
        for (List<String> list : paths) {
            if (!hm.containsKey(list.get(1))) {
                return list.get(1);
            }
        }
        
        return null;
    }
}