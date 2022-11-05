# try:
#     num=int(input("정수입력\n>>>"))
#     print("원의반지름",num)
#     print("원의둘레",2*3.14*num)
#     print("원의 넓이",3.14*num**2)
# except Exception as exception:
#     print("type(exception):",type(exception))
#     print("exception:",exception)

# list_n=[52,273,32,72,100]

# try:
#     num=int(input("정수입력\n>>>"))

#     print("{}번째 요소: {}".format(num,list_n[num]))
    
# except ValueError :
#     print("정수를 입력해 주세요!")
# except IndexError:
#     print("리스트의 인덱스를 벗어났어요")
# list_n=[52,273,32,72,100]
# try:
#     num=int(input("정수입력\n>>>"))

#     print("{}번째 요소: {}".format(num,list_n[num]))
#     예외.발생()
# except ValueError :
#     print("정수를 입력해 주세요!")
# except IndexError:
#     print("리스트의 인덱스를 벗어났어요")
list_n=[52,273,32,72,100]
try:
    num=int(input("정수입력\n>>>"))

    print("{}번째 요소: {}".format(num,list_n[num]))
    예외.발생()
except ValueError :
    print("정수를 입력해 주세요!")
except IndexError:
    print("리스트의 인덱스를 벗어났어요")
except Exception as ex:
    print("예상못한 에러발생")
    print("ex:",ex)