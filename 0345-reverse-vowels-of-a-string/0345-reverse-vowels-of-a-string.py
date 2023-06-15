class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = "aeiouAEIOU"
        s_list = list(s)
        p1 = 0
        p2 = len(s) - 1
        while p1 < p2:
            while not s_list[p1] in vowels and p1 < p2:
                p1 += 1
            while not s_list[p2] in vowels and p2 > p1:
                p2 -= 1
            if (p1 < p2):
                s_list[p1], s_list[p2] = s_list[p2], s_list[p1]
                p1 += 1
                p2 -= 1
        return ("").join(s_list)