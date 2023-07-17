class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        hm = {}
        for i in range(len(s)):
            ch = s[i]
            hm[ch] = hm.get(ch, 0) + 1
            ch = t[i]
            hm[ch] = hm.get(ch, 0) - 1
        ch = t[len(s)]
        hm[ch] = hm.get(ch, 0) - 1
        
        for key, value in hm.items():
            if value == -1:
                return key
        
            