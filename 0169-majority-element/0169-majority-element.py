class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        d = {}
        n = len(nums)
        for num in nums:
            d[num] = d.get(num, 0) + 1
            if d.get(num) > n // 2:
                return num
