class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result =  [0] * n
        result[0] = 1
        
        # result[i] = product of all numbers to the left
        for i in range(1, n):
            result[i] = result[i - 1] * nums[i - 1];
    
        # result[i] *= product of all numbers to the rigth
        right = 1
        for i in range(n - 1, -1, -1):
            result[i] *= right
            right *= nums[i]
        
        return result