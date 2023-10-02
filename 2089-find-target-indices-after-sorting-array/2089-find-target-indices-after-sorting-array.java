class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        int mid;
        
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                low = mid;
                high = mid;
                while (low >= 0 && nums[low] == target) {
                    low--;
                }
                while (high < nums.length && nums[high] == target) {
                    high++;
                }
                 
                for (int i = low + 1; i < high; i++) {
                    list.add(i);
                }
                return list;
                
            }
        }   
        return list;
    }
}