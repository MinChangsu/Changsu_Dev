# try:
#     num=int(input("정수입력\n>>>>"))
    # print("원의 반지름",num)
    # print("원의 둘레",2*3.14*num)
    # print("원 넚이",3.14*num**2)
# except :
#     print("무언가 잘못됨")

# list_a=["52","273","32","스파이","103"]

# list_n=[]

# for i in list_a:
#     try:
#         float(i)
#         list_n.append(i)
#     except:
#         pass 

# print(list_n)
try:
    num=int(input("정수입력\n>>>"))
    print("원의 반지름",num)
    print("원의 둘레",2*3.14*num)
    print("원 넚이",3.14*num**2)
except:
    print("정수 입력안함")
else:
    print("예외발생하지않음")
finally:
    print("일단 프로그램 어떻게든 끝남")