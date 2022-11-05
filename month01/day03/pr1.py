# num=int(input("정수입력> "))
# if num>0:
#     print("양수입니다")
# if num<0:
#     print("음수입니다")
# if num==0:
#     print("0입니다")

import datetime
now= datetime.datetime.now()
print("{}년 {}월 {}일".format(now.year,now.month,now.day))

if now.hour < 12:
    print("지금은 오전입니다")

if 3<=now.month<=5:
    print("지금은 봄 입니다.")
elif 6<=now.month<=8:
    print("지금은 여름 입니다.")
elif 9<=now.month<=10:
    print("지금은 가을 입니다.")
else:
    print("지금은 겨울 입니다.")
