class Solution:
    def longestPalindrome(self, s: str) -> int:
        letters = {}
        result = 0
        odd_flag = False
        for ch in s:
            if ch in letters:
                letters[ch] += 1
            else:
                letters[ch] = 1
        for ch, value in letters.items():
            if value % 2 == 0:
                result += value
            else:
                result += (value // 2) * 2;
                odd_flag = True
    
        if odd_flag:
            result += 1
    
        return result