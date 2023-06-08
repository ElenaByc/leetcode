class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])
        
        if grid[0][0] < 0:
            return n * m
        if grid[-1][-1] >= 0:
            return 0
        
        row = m - 1
        col = 0
        count = 0
        
        while row >= 0 and col < n:
            if grid[row][col] < 0:
                count += n - col
                row -= 1
            else:
                col += 1
                    
        return count
                    
                
        