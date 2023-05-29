class ParkingSystem:
    big = 0
    medium = 0
    small = 0

    def __init__(self, big: int, medium: int, small: int):
        self.big_max = big
        self.medium_max = medium
        self.small_max = small
        

    def addCar(self, carType: int) -> bool:
        if carType == 1:
            if  self.big < self.big_max:
                self.big += 1
                return True
            else:
                return False
        elif carType == 2:    
            if  self.medium < self.medium_max:
                self.medium += 1
                return True
            else:
                return False
        elif carType == 3:    
            if  self.small < self.small_max:
                self.small += 1
                return True
            else:
                return False

# Your ParkingSystem object will be instantiated and called as such:
# obj = ParkingSystem(big, medium, small)
# param_1 = obj.addCar(carType)