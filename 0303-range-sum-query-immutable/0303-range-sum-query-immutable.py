class NumArray:
    def __init__(self, nums: List[int]):
        self.sums = []
        sum = 0
        for n in nums:
            sum += n
            self.sums.append(sum)

    def sumRange(self, left: int, right: int) -> int:
        if left >= 1:
            return self.sums[right] - self.sums[left - 1]
        return self.sums[right]
        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)