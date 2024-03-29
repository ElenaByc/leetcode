class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        res = 0
        i = 0
        count = {c: 0 for c in 'abc'}
        
        print(count)
        
        for j in range(len(s)):
            count[s[j]] += 1
            while all(count.values()):
                count[s[i]] -= 1
                i += 1
            res += i
        return res