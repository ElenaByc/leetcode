class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) % 2 != 0:
            return False
        arr = []
        open = ['(', '{', '[']
        for el in s:
            if el in open:
                arr.append(el)
            else:
                if len(arr) == 0:
                    return False
                if el == ')':
                    if arr[-1] == '(':
                        del arr[-1]
                    else:
                        return False
                elif el == '}':
                    if arr[-1] == '{':
                        del arr[-1]
                    else:
                        return False
                elif el == ']':
                    if arr[-1] == '[':
                        del arr[-1]
                    else:
                        return False
        
        return (len(arr) == 0)
                     
        
                