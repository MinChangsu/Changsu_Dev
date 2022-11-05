


np=2
mp=10
p=6
memo={}
def Qz(a,b):
    key=str([a,b])
    if key in memo:
        return memo[key]
    if a<0:
        return 0
    if a==0:
        return 1
    cnt=0
    for i in range(b,mp+1):
        cnt+= Qz(a-i,i)
    memo[key]=cnt

    return cnt

print(Qz(6,2))
