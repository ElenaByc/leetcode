class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        altitude = 0
        max_altitude = 0
        for x in gain: 
            altitude += x
            if altitude > max_altitude:
                max_altitude = altitude
        return max_altitude
            