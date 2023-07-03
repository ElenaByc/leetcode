class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        p1 = 1    # current element in the original array
        p2 = 0    # unique elements
        
        elem = nums[0]
        
        while p1 < len(nums):
            if nums[p1] != nums[p2]:
                # next unique
                p2 += 1
                nums[p2] = nums[p1]
            p1 += 1
        
        return p2 + 1
                
        
        
            
        