class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int n = s.length();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list;
        char ch = s.charAt(0);
        int start = 0;
        int cnt = 1;
        
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ch) {
                cnt++;
            } else {
                if (cnt >= 3) {
                    list = new ArrayList<>();
                    list.add(start);
                    list.add(i - 1);
                    result.add(list);
                }
                ch = s.charAt(i);
                cnt = 1;
                start = i;
            }
        }
        if (cnt >= 3) {
            list = new ArrayList<>();
            list.add(start);
            list.add(n - 1);
            result.add(list);
        }
        
        return result;
        
    }
}