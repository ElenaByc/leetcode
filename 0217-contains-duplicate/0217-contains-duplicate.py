class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        mp = {}
        for x in nums:
            if x in mp:
                mp[x] += 1
            else:
                mp[x] = 1
        print(mp)
        for value in mp.values():
            if value > 1:
                return True
            
        return False