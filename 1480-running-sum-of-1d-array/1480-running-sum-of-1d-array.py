class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        result = []
        prev = 0
        for number in nums:
            result.append(number + prev)
            prev += number

        return result