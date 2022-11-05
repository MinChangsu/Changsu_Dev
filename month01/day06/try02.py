# def fw(fn,text):
#     try:
#         f=open(fn,"w")
#         return
#         f.write(text)
#     except:
#         print("오류발생")
#     finally:
#         f.close()

# fw("fi","민경서")

print("====프로그램 시작====")
while True:
    try:
        print("try시작")
        break
    except:
        print("except구문")
    finally:
        print("finally구문")
    print("반복문 마지막구문")
print("====프로그램 종료====")