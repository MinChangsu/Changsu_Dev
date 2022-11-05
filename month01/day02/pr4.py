import math
#구의 반지름을 r이라고할때

# 부피3/4*pi*r
# 겉넓이= 4*pi*r^2
pi=3.141592
r=5

BU=(4*pi*(r**3))/3
W=4*pi*(r**2)

print(BU)
print(W)

def PI(a,b):
    c=math.sqrt((a**2)+(b**2))
    return c

C=PI(3.0,4.0)
print(C)

