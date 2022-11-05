# with open("min","r")as f:
#     h=f.read()
# print(h)
import random

han=list("가나다라마바사아자차카타파하")

# with open("info.txt","w")as f1:
#     for i in range(100):
#         name=random.choice(han)+random.choice(han)
#         weight=random.randrange(40,100)
#         height=random.randrange(140,200)
#         f1.write("{},{},{}\n".format(name,weight,height))

with open("info.txt","r")as f1:
    for i in f1:
        (name,weight,height)=i.strip().split(",")
        if(not name)or(not weight)or(not height):
            continue
        bmi=int(weight)/((int(height)/100)**2)
        re=""
        if 25 <= bmi:
            re="과체중"
        elif 18.5<= bmi:
            re="정상"
        else:
            re="저체중"
        print("\n".join([
            "이름:{0}",
            "몸무계:{1}",
            "키:{2}",
            "BMI:{3}",
            "결과:{4}"]).format(name,weight,height,bmi,re))

