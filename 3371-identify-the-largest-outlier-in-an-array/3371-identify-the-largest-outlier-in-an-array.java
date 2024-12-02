class Solution {
    public int getLargestOutlier(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        long total = 0;
        for (int num : nums) {
            total += num;
        }
        // System.out.println(Arrays.toString(nums));
        // System.out.println("total = " + total);
        
        long sum;
        for (int i = n - 1; i >= 0; i--) {
            int num = nums[i];
            sum = total - num;
            if (sum % 2 != 0) {
                continue;
            }
            //binary search for sum / 2
            sum /= 2;
            int low = 0;
            int high = n - 1;
            int mid;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (nums[mid] == sum) {
                    if (mid != i) {
                        return num;
                    } 
                    if (mid > 0 && nums[mid - 1] == sum) {
                        return num;
                    }
                    if (mid < n - 1 && nums[mid + 1] == sum) {
                        return num;
                    }
                    low = high + 1;
                } else if (nums[mid] > sum) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            
        }
        
        return 0;
    }
}