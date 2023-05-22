class Solution:
    def addBinary(self, a: str, b: str) -> str:
        result = [] 
        max_len = max(len(a), len(b))
        a = a.zfill(max_len)
        b = b.zfill(max_len)
        a = list(map(lambda x: int(x), list(a)))
        b = list(map(lambda x: int(x), list(b)))

        carry = 0
        for i in range(max_len - 1, -1, -1):
            sum = a[i] + b[i] + carry
            if sum < 2:
                result.append(sum)
                carry = 0
            elif sum == 2:
                result.append(0)
                carry = 1
            else: 
                result.append(1)
                carry = 1
        if carry == 1:
            result.append(1)
        
        result.reverse()

        return "".join(list(map(lambda x: str(x), result)))
            
            