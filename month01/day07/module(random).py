import random 
print("#random 모듈")
#random():0.0<=x<1.0 사이의 float를 리턴
print("random():",random.random())

#uniform(min,max):지정한 범위 사이의 float를 리턴한다.
print("uniform(10,20):",random.uniform(10,20))
#randrange():지정한 범위의 int를 리턴
print("randrange : ",random.randrange(10,20))
#choice(list):리스트 내부에 있는 요소를 랜던하게 선택한다.
print("-choice([1,2,3,4,5]) : ",
random.choice([1,2,3,4,5]))
#shuple(list):리스트의 요소들을 랜덤하게 섞는다.
print("shuple([1,2,3,4,5])",
random.shuffle([1,2,3,4,5]))
#sample(list,k=숫자):리스트의 요소중에 k개를 뽑기
print("sample([1,2,3,4,5],k=2) : ",
random.sample([1,2,3,4,5],k=2))


# num=int(input("몇개 추천할까요?\n>>>"))
# for i in range(num):
#     lo=[]
#     while len(lo)<=5:
#         a=random.randrange(1,46)
#         if a not in lo:
#             lo.append(a)
#     lo.sort()
#     print(lo)

num=3
for i in range(num):
    lo=list(random.sample(range(1,46),k=6))
    lo.sort()
    print(lo)
