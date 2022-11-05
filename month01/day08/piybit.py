import math
class Circle:
    def __init__(self,ra):
        self.ra=ra
    def get_circum(self):
        return 2*math.pi*self.ra
    def get_area(self):
        return math.pi*(self.ra**2)

circle=Circle(10)

print(circle.get_circum())
print(circle.get_area())

