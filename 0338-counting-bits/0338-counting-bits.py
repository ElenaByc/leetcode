class Solution:
    def countBits(self, n: int) -> List[int]:
        result = [];
        result.append(0)
        i = 1
        while i <= n:
            result.append(self.hammingWeight(i))
            i += 1
        return result
        
        
    def hammingWeight(self, n: int) -> int:
        ans = 0
        while n:
            n &= (n-1)
            ans += 1
        return ans
        