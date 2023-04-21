class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        left_sum = 0
        right_sum = sum(nums)
        for i, number in enumerate(nums):
            right_sum -= number
            if left_sum == right_sum:
                return i
            left_sum += number
        return -1    
