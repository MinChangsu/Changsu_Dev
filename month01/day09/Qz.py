import random
# #1
# a=input("영어로 아무말이나 쓰셈")
# a=a.upper()
# print(a)
# #2
# n=int(input("정수입력"))
# if n %5==0:
#     print("5의배수임")
# else:
#     print("5의배수가아님")
# #3
# n=int(input("학생의점수\n>>>"))
# if n>=90:
#     print("학점은 A입니다.")
# elif n>=80:
#     print("학점은 B입니다.")
# elif n>=70:
#     print("학점은 C입니다.")
# elif n>=60:
#     print("학점은 D입니다.")
# else:
#     print("학점은 f입니다.")
# #4
# for i in range(1,101):
#     if str(i).count("0")==1 :
#         print(i)
# #5
# for i in range(5,0,-1):
#     print(f"{i}"*i)

# for i in range(5,0,-1):
#     for k in range(i):
#         print(i,end="")
#     print()

#5
def getData(maxNum=100):
    return random.randrange(1,maxNum+1)
    
