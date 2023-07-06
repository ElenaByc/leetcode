class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        if max(nums) >= target:
            return 1
        if sum(nums) < target:
            return 0
        
        l = 0
        r = 0
        current_sum = 0
        current_len = 0
        min_len = len(nums) + 1
        
        while r < len(nums):
            current_sum += nums[r]
            r += 1
            # print("l = ", l)
            # print("r = ", r)
            # print("current_sum = ", current_sum)

            if current_sum >= target:
                # try to move left pointer
                
                while current_sum >= target:
                    current_sum -= nums[l]
                    l += 1
                current_len = r - l + 1
                min_len = min(min_len, current_len)
            
        
        if min_len == len(nums) + 1:
            return 0
        return min_len
            
            