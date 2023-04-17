class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        result = []
        max_value = max(candies)
        for value in candies:
            result.append(value + extraCandies >= max_value)
        return result
                