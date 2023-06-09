class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        
        low = 0
        high = len(letters) - 1
        
        if letters[high] <= target or letters[0] > target:
            return letters[0]
        
        while low <= high:
            mid = low + (high - low) // 2
            if letters[mid] <= target:
                low = mid + 1
            else:
                high = mid - 1
                
        return letters[low]
        