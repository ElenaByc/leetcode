class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evens.add(nums[i]);
            } else {
                odds.add(nums[i]);
            }
        }
        
        evens.sort(Comparator.naturalOrder());
        odds.sort(Comparator.reverseOrder());
        
        System.out.println(odds);
        System.out.println(evens);
        int j = 0;
        int k = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = evens.get(j);
                j++;
            } else {
                result[i] = odds.get(k);
                k++;
            }
        }
        
        return result;
    }
}