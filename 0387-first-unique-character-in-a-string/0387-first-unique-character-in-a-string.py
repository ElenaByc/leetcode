class Solution:
    def firstUniqChar(self, s: str) -> int:
        char_indexes = {}
        for i, ch in enumerate(s):
            if ch in char_indexes:
                char_indexes[ch].append(i)
            else:
                char_indexes[ch] = [i]
        
        min_i = len(s) + 1
        for ch, arr in char_indexes.items():
            if len(arr) == 1:
                if arr[0] < min_i:
                    min_i = arr[0]
        
        if min_i == len(s) + 1:
            return -1
        return min_i
        