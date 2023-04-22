class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        count = 0
        for ch in s:
            if t.find(ch, count) == -1:
                return False
            else:
                count = t.find(ch, count) + 1

        return True