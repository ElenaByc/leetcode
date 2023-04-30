class Solution:
    def fib(self, n: int) -> int:
        curr_num = 0
        next_num = 1
        for i in range(n):
            next_num += curr_num
            curr_num = next_num - curr_num
    
        return curr_num