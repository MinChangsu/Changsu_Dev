for i in range(10):
    for k in range(i):
        print("*",end="")
    print() 

num=10
for k in range(1,num):
        print(" "*(num-k),end="")
        print("*"*k)
        


num=20
cnt=1

for i in range(1,num):
    print(" "*(num-i),end="")
    print("*"*cnt)
    cnt+=2




