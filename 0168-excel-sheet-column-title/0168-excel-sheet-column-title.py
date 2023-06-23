class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        result = []
        columnNumber -= 1
        while columnNumber > 25:
            rem = columnNumber % 26
            columnNumber = columnNumber // 26
            result.append(alphabet[rem])
            columnNumber -= 1

        result.append(alphabet[columnNumber])
        return "".join(result[::-1])
            
        