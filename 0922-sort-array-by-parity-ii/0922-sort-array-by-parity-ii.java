class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenPointer = 0;
        int oddPointer = 1;
        int n = nums.length;
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            if(nums[i] % 2 == 0) {
                answer[evenPointer] = nums[i];
                evenPointer += 2;
            } else {
                answer[oddPointer] = nums[i];
                oddPointer += 2;
            }
        }
        
        return answer;
    }
}