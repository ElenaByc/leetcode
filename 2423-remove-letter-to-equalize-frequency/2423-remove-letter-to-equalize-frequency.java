class Solution {
    public boolean equalFrequency(String word) {
        int[] letters = new int[26];
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            letters[ch - 'a']++;
        }
        
        Map<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < 26; i++) {
            if (letters[i] > 0) {
                int val = hm.getOrDefault(letters[i], 0);
                val++;
                hm.put(letters[i], val);
            }
        }
        
        // System.out.println(hm);
        if (hm.size() > 2) {
            return false;
        }
        if (hm.size() == 1) {
            for (int key : hm.keySet()) {
                return (key == 1 || hm.get(key) == 1);
            }
        }
        
        int[][] arr = new int[2][2];
        int i = 0;
        for (int key : hm.keySet()) {
            arr[i][0] = key;
            arr[i][1] = hm.get(key);
            i++;
        }
        // System.out.println(Arrays.deepToString(arr));
        if (arr[0][0] == 1 && arr[0][1] == 1) {
            return true;
        } 
        if (arr[1][0] == 1 && arr[1][1] == 1) {
            return true;
        }   
        if (arr[0][1] == 1 && arr[1][1] == 1) {
            return Math.abs(arr[0][0] - arr[1][0]) == 1; 
        }
        if (arr[0][1] == 1) {
            return arr[0][0] - arr[1][0] == 1;
        } 
        if (arr[1][1] == 1) {
            return arr[1][0] - arr[0][0] == 1;
        }
        
        return false;
    }
}