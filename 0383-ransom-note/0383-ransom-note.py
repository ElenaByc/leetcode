class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        magazine_dict = {}
        for m in magazine:
            if m in magazine_dict:
                magazine_dict[m] += 1
            else:
                magazine_dict[m] = 1
        for r in ransomNote:
            if r in magazine_dict:
                magazine_dict[r] -= 1
                if magazine_dict[r] < 0:
                    return False
            else: 
                return False
        
        return True
