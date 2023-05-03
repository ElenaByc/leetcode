class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {}
        for i, number in enumerate(nums):
            if target - number in hm:
                return [ hm[target - number], i]
            hm[number] = i
            
        
            
            