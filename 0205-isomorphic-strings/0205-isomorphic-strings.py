class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) == 0:
            return True
        
        m_s = {}
        m_t = {}
        for i in range(len(s)):
            if s[i] in m_s:
                if m_s[s[i]] != t[i]:
                    return False
            else:
                m_s[s[i]] = t[i]
            if t[i] in m_t:
                if m_t[t[i]] != s[i]:
                    return False
            else:
                m_t[t[i]] = s[i]    

        return True  
                
        