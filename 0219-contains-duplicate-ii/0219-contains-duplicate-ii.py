class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        hm = {}
        for i in range(len(nums)):
            if nums[i] not in hm:
                hm[nums[i]] = i
            else:
                if abs(hm[nums[i]] - i) <= k:
                    return True
                hm[nums[i]] = i # update index

        return False
