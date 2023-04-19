class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        triangle = [[1]]
        for i in range (2, numRows + 1):
            arr = [0] * i
            arr[0] = 1
            arr[i - 1] = 1
            for j in range(1, i - 1):
                arr[j] = triangle[i - 2][j - 1] +  triangle[i - 2][j]
            triangle.append(arr)
        return triangle