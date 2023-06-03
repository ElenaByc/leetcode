class Solution:
    def maximizeSum(self, nums: List[int], k: int) -> int:
        max_num = max(nums)
        sum = 0
        while k > 0:
            sum += max_num
            k -= 1
            max_num += 1

        return sum