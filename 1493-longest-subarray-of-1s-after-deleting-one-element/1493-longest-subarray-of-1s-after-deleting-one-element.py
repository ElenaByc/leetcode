class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        # if all 1 or if only one 0 return len - 1
        if sum(nums) >= len(nums) - 1:
            return len(nums) - 1
        
        l = 0
        r = 0
        max_len = 0
        zero_counter = 0
        
        while r < len(nums):
            if nums[r] == 0:
                zero_counter += 1
            
            while zero_counter > 1:
                if nums[l] == 0:
                    zero_counter -= 1
                l +=1
                
            max_len = max(max_len, r - l)
            r +=1
            
        return max_len
            
        
        
        
        
        