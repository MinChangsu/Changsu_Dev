i=0

while i<10:
    print(f"{i+1}번쨰 반복입니다.")
    i+=1

list_a=[1,2,2,2,4]
num=2
cnt=0

while num in list_a:
    list_a.remove(num)
    cnt+=1
    print(f"{cnt}번 삭제완료")

print(list_a)

import time
num=0
tick=time.time()+5

while time.time() < tick:
    num+=1

print(num)

