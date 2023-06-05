class Solution:
    def checkStraightLine(self, coordinates: List[List[int]]) -> bool:
        if len(coordinates) == 2:
            return True
        point1 = coordinates[0]
        point2 = coordinates[1]
        
        # horizontal line
        if point1[1] == point2[1]:
            for p in coordinates:
                if p[1] != point1[1]:
                    return False
            return True

        # vertical line
        if point1[0] == point2[0]:
            for p in coordinates:
                if p[0] != point1[0]:
                    return False
            return True 
        
        k = (point1[1] - point2[1])/(point1[0] - point2[0])
        c = point1[1] - k * point1[0]
        
        for p in coordinates:
            if p[1] != k * p[0] + c:
                return False
        
        return True