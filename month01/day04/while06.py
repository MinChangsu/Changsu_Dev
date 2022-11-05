V=0
a=0
b=0

for i in range(101):
    j=100-i
    c=i*j
    if V<c:
        V=c
        a=i
        b=j

print("최대가 되는경우: {}*{}={}".format(a,b,V))


    


