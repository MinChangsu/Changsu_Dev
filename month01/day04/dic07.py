# pets=[
#     {"name":"구름","age":5},
#     {"name":"초코","age":3},
#     {"name":"아지","age":1},
#     {"name":"호랑이","age":1},
    
# ]

# print("우리 동네 애완 동물들")
# print(pets[0]["name"],str(pets[0]["age"])+"살")
# print(pets[1]["name"],str(pets[1]["age"])+"살")
# print(pets[2]["name"],str(pets[2]["age"])+"살")
# print(pets[3]["name"],str(pets[3]["age"])+"살")

# from itertools import count


# num=[1,2,6,8,4,3,2,1,9,5,4,9,7,2,1,3,5,4,8,9,7,2,3]
# counter={}


# for i in num:
#     if i not in counter:
#         counter[i]=num.count(i)

# print(counter)

cha={
    "name":"기사",
    "level":12,
    "items":{
        "sword":"불꽃의 검",
        "armor":"풀플레이트"
    },
    "skill":["베기","세게 베기","아주 세게 베기"]

}
for i in cha:
    if type(cha[i]) is str or type(cha[i]) is int:
        print("{} :".format(i),cha[i])
    elif type(cha[i]) is int:
        print("{} :".format(i),cha[i])
    elif type(cha[i]) is dict:
        for k in cha[i]:
            print(k ,":", cha[i][k])
    elif type(cha[i]) is list:
        for j in cha[i]:
            print(i,":",j)

