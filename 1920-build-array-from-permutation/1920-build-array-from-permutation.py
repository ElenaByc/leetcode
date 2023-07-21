class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = []
        for i in  range(n):
            result.append(nums[nums[i]])
        return result
        