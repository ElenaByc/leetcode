class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        hm = {}
        
        for n in nums:
            hm[n] = hm.get(n, 0) + 1
        
        for key, val in hm.items():
            if val == 1:
                return key
        
        return -1