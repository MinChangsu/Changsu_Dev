A=[1,2,[3,4,5,[6,7,8,[9,10],11,12]]]

def fl(n):
    ol=[]
    for i in n:
        if type(i)==list:
            ol+=fl(i)

            
        else:
            ol.append(i)
    return ol

print(fl(A))

