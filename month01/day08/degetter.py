import math as m

class Circle:
    def __init__(self,raidus):
        self.__radius =raidus
    def get_circum(self):
        return 2*m.pi*self.__radius
    def get_area(self):
        return m.pi*(self.__radius**2)
    @property
    def radius(self):
        return self.__radius