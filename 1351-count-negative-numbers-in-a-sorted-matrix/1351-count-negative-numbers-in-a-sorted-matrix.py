class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])
        count = 0
        
        if grid[0][0] < 0:
            return n * m
        if grid[-1][-1] >= 0:
            return 0
        
        for i in range(m):
            for j in range(n):
                if grid[i][j] < 0:
                    count += n - j
                    break
                    
        return count
                    
                
        