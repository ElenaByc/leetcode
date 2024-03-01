class Solution {
    public String oddString(String[] words) {
        int n = words[0].length();
        
        int[] arr0 = diffArray(words[0], n);
        int[] arr1 = diffArray(words[1], n);
        int[] arr2 = diffArray(words[2], n);
        
        for (int i = 0; i < n; i++) {
            if (arr0[i] == arr1[i] && arr0[i] != arr2[i]) {
                return words[2];
            } 
            if (arr0[i] == arr2[i] && arr0[i] != arr1[i]) {
                return words[1];
            }
            if (arr2[i] == arr1[i] && arr0[i] != arr2[i]) {
                return words[0];
            }
        }
        
        int arr[];
        // remove duplicates from words
        Set<String> set = new HashSet<>(Arrays.asList(words));
        for (String s : set) {
            arr = diffArray(s, n);
            for (int j = 0; j < n; j++) {
                if (arr[j] != arr0[j]) {
                    return s;
                }
            }
        }
        
        return "";
        
    }
    
    public int[] diffArray(String s, int n) {
        int[] result = new int[n];
        
        for (int i = 0; i < n - 1; i++) {
            result[i] = s.charAt(i + 1) - s.charAt(i);
        }
        
        return result;
    }
}