
# out=[i for i in range(1,101) if ("{:b}".format(i)).count("0")==1]

# for i in out:
#     print("{} : {}".format(i,"{:b}".format(i)))
# print("합계:",sum(out))

#QZ1

# A=[1,2,3,4,1,2,3,1,4,1,2,3]
# dic={}
# for i in A:
#     if i not in dic:
#         dic[i]=A.count(i)
# print(dic)

#QZ2

# A=input("ctacaatgtcagtatacccattgcattagccgg\n위에꺼 입력>>>")
# dic={}
# L=[]
# for i in range(len(A)):
#     L.append(A[i])

# for i in L:
#     if i not in dic:
#         dic[i]=L.count(i)

# for i in dic:
#     print("{}의 개수: {}".format(i,dic[i]))

# #QZ3
# A="ctacaatgtcagtatacccattgcattagccgg"
# L=[]
# cnt=0
# dic={}
# for i in range(0,len(A),3):
    
#     co=A[i:i+3]
#     if co not in dic:
#         dic[co]=0
#     dic[co]+=1
# print(dic)
    




#QZ4
# A=[1,2,[3,4],5,[6,7],[8,9]]
# L=[]
# for i in A:
#     if type(i) is list:
#         for k in i:
#             L.append(k)
#     else:
#         L.append(i)
# print("{}를 평탄화하면 {}입니다,".format(A,L))

