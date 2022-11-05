from urllib import request

target =request.urlopen("https://www.hanbit.co.kr/images/common/logo_hanbit.png")

output=target.read()

print(output)

with open("output_han.png","wb")as f:
    f.write(output)
    
 