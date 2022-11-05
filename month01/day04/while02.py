i=1

while True:
    print("{}번쨰 반복입니다".format(i))
    i+=1
    Qz=input("종료하시겠습니까?(Y/N)\n>>>")
    if Qz in ["Y","y"]:
        print("반복을 종료하겠습니다.")
        break
    elif Qz in ["N","n"]:
        print("다시 반복합니다")
        
    else:
        print("잘못누르셨습니다.")

