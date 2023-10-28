class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        int n = s.length();
        int pos;
        for (int i = 0; i < n; i++) {
            pos = s.charAt(i) - 'a';
            if(arr[pos] != -1) {
                if (i - arr[pos] - 1 != distance[pos]) {
                    return false;
                }
            } else {
                arr[pos] = i;
            }
        }
        return true;
    }
}