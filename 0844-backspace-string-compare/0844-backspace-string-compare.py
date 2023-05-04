class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        s_list = []
        t_list = []
        
        for ch in s:
            if ch != '#':
                s_list.append(ch)
            else:
                if (len(s_list) > 0):
                    s_list.pop(-1)
    
        for ch in t:
            if ch != '#':
                t_list.append(ch)
            else:
                if (len(t_list) > 0):
                    t_list.pop(-1)
                
        return (''.join(s_list) == ''.join(t_list))
                
        