def sum_a(s,e):
    sum=0
    for i in range(s,e):
        sum+=i
        i+=1
    return sum

print(sum_a(1,11))

def sum_b(s=0,e=100,a=1):
    sum=0
    for i in range(s,e+1,a):
        sum+=i
    return sum

print(sum_b())



