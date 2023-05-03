class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        answer0 = []
        answer1 = []
        for number in nums1:
            if not (number in nums2) and not (number in answer0):
                answer0.append(number)
        for number in nums2:
            if not (number in nums1) and not (number in answer1):
                answer1.append(number)
        return [answer0, answer1]