class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        result = ""
        for i in range(min(len(word1), len(word2))):
            result += word1[i] + word2[i]
            print(result)
        if len(word1) > len(word2):
            result += word1[len(word2):]
        elif len(word2) > len(word1):
             result += word2[len(word1):]
        return result