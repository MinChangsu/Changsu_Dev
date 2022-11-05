def power(i):
    return i*i

def under_3(i):
    return i<3

list_a=[1,2,3,4,5]

out_a=map(power,list_a)
print(list(out_a))

out_b=filter(under_3,list_a)

print(list(out_b))
