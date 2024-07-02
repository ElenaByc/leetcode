class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        List<Integer> list = new ArrayList();
        
        for (int n : nums1) {
            arr[n]++;
        }
        
        for (int n : nums2) {
            if (arr[n] > 0) {
                list.add(n);
                arr[n]--;
            }
        }
        
        int[] result = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}