# def mul(x):
#     b=1
#     for i in range(x,0,-1):
#         b*=i
#     return b

# print(mul(4))




# def fac(x):
    
#     if x==0:
#         return 1
#     else:
#         return x*fac(x-1)

# print(fac(5))

# #피보나치 반복
# li=[]
# def pi(n,a=0,b=1):
#     pa,nt=a,b
#     for i in range(n):
#         li.append(pa)
#         pa,nt=nt,pa+nt
#     return print(pa)

# pi(50)
# print(li)
#피보나치 yield 활용
# def pi(n,a=0,b=1):
#     pa,nt=a,b
#     for i in range(n+1):
#         yield pa
#         pa,nt=nt,pa+nt

# pi=pi(10)



# for i in pi:
#     print(i)

# 피보나치 재귀



# def fib(n):
#     if n==0:
#         return 0
#     elif n==1 or n==2:
#         return 1
#     else:
#         return fib(n-1)+fib(n-2)

# from functools import lru_cache

# @lru_cache(maxsize=None)

# def fibb(n):
#     if n==0:
#         return 0
#     elif n==1 or n==2:
#         return 1
#     else:
#         return fibb(n-1)+fibb(n-2)
# print(fibb(50))

# print("계산{}번 답{}".format(a[0],a[1]))

# dic={
#     1:1,2:1
# }
# def fib(n):
#     if n in dic:
#         return dic[n]
#     else:
#         out= fib(n-1)+fib(n-2)
#         dic[n]=out
#         return out

# print(fib(50))

# print(dic)


    