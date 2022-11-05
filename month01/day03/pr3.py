x=11
if 10<x<20:
    print("조건에맞습니다.")

str_input = input("태어난해를 입력해주세요")
birth_year=int(str_input)%12

if birth_year==0:
    print("원숭이띠")
elif birth_year==1:
    print("닭띠")
elif birth_year==2:
    print("개띠")
elif birth_year==3:
    print("돼지띠")
elif birth_year==4:
    print("쥐띠")
elif birth_year==5:
    print("소띠")
elif birth_year==6:
    print("호랑이띠")
elif birth_year==7:
    print("토끼띠")
elif birth_year==8:
    print("용띠")
elif birth_year==9:
    print("뱀띠")
elif birth_year==10:
    print("말띠")
elif birth_year==11:
    print("양띠") 