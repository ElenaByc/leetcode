class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        char ch;
        int val;
        List<Character> list;
        HashMap<Integer, List<Character>> hm2 = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        
        // System.out.println(hm);
        for (char ch1 : hm.keySet()) {
            val = hm.get(ch1);
            if (hm2.containsKey(val)) {
                list = hm2.get(val);
            } else {
                list = new ArrayList<>();
            }
            list.add(ch1);
            hm2.put(val, list);
        }
        // System.out.println(hm2);
        int len = hm2.size();
        int[] nums = new int[len];
        int i = 0;
        for (int num : hm2.keySet()) {
            nums[i] = num;
            i++;
        }
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        StringBuilder sb = new StringBuilder();
        for (i = len - 1; i >= 0; i--) {
            list = hm2.get(nums[i]);
            for (int j = 0; j < list.size(); j++) {
                ch = list.get(j);
                sb.append((""+ch).repeat(nums[i]));
            }
        }
        
        return sb.toString();
    }
}