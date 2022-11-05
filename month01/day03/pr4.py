import datetime
now=datetime.datetime.now().time()
H=input("?")
if "안녕" in H:
    print("안녕하세요")
elif "몇시" in H or "시간" in H:
    print("현재 시간은{}시{}분입니다.".format(now.hour,now.minute))

