class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> hm = new HashMap<>();
        int maxVal = 0;
        String result = "";
        
        
        for (String s : banned) {
            set.add(s);
        }
        
        String[] arr = paragraph.split("[!?',;. ]");
        // System.out.println(Arrays.toString(arr));
        for (String s : arr) {
            if (s.length() == 0) {
                continue;
            }
            s = s.toLowerCase();
            // System.out.println(s);
            if (set.contains(s)) {
                continue;
            }
            hm.put(s, hm.getOrDefault(s, 0) + 1);
            if (hm.get(s) > maxVal) {
                maxVal = hm.get(s);
                result = s;
            }
        }
        // System.out.println(hm);
        return result;
    }
}