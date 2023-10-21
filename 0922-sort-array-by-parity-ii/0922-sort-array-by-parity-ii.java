class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenPointer = 0;
        int oddPointer = 1;
        int n = nums.length;
        int temp;
        
        while (evenPointer < n && oddPointer < n) {
            while (evenPointer < n && nums[evenPointer] % 2 == 0) { 
                evenPointer += 2;
            } 
            while (oddPointer < n && nums[oddPointer] % 2 != 0) {
                oddPointer += 2;
            }
            if (evenPointer < n && oddPointer < n) {
                temp = nums[evenPointer];
                nums[evenPointer] = nums[oddPointer];
                nums[oddPointer] = temp;
                evenPointer += 2;
                oddPointer += 2;
            }
                
        }
            
        
        return nums;
    }
}