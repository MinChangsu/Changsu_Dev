# nums=[1,2,3,4,5,6]
# numst=[]
# for i in nums:
#     numst.append(str(i))
# a=list("가나다라마")
# print(str(nums))
# print(":".join(str(nums)))
# print(":".join(a))
# print("::".join(numst))

#2
# numbers=list(range(1,11))
# a=lambda x:x%2==1
# print(list(filter(a,numbers)))
# b=lambda x:3<=x<7
# print(list(filter(b,numbers)))
# c=lambda x:x**2<50
# print(list(filter(c,numbers)))

nums=[1,2,3,4,5]
num=map(str,nums)


num=list(num)
print("::".join(num))