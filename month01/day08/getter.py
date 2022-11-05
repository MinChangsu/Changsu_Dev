import math as m
class Circle:
    def __init__(self,raidus):
        self.__radius =raidus
    def get_circum(self):
        return 2*m.pi*self.__radius
    def get_area(self):
        return m.pi*(self.__radius**2)

    def get_radius(self):
        return self.__radius
    def set_radius(self,value):
        if value <=0:
            raise TypeError("길이는 양의 숫자여야함")
        else:
            self.__radius=value
    

circle=Circle(10)

print(circle.get_radius())
print(circle.set_radius(10))

print(circle.get_radius())