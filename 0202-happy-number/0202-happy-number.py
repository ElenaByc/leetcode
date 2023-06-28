class Solution:
    def isHappy(self, n: int) -> bool:
        seen = set()

        while not (n == 1 or n in seen):
            seen.add(n)
            # print(seen)
            sum = 0      #  sum of the squares of the digits
            while n != 0:
                digit = n % 10
                sum += digit * digit
                n //= 10
            n = sum
            
        return n == 1