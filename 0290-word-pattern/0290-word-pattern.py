class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        pattern = list(pattern)
        hm = {}
        if len(pattern) != len(words):
            return False
        
        for i in range(len(pattern)):
            ch = pattern[i]
            word = words[i]
            if ch in hm:
                if hm[ch] != word:
                    return False
            elif word in set(hm.values()):
                return False
            else:
                hm[ch] = word
        
        return True