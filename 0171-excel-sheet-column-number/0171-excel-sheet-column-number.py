class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        chars = list(columnTitle)
        chars.reverse()
        result = 0
        power = 0
        for ch in chars:
            result += (ord(ch) - ord("A") + 1) * pow(26, power)
            power += 1
        return result