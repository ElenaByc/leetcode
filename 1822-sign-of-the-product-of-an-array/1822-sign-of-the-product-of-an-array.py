class Solution:
    def arraySign(self, nums: List[int]) -> int:
        product  = 1
        for number in nums:
            if number == 0:
                return 0
            product *= number
        if product > 0:
            return 1
        else:
            return -1
        