# def solution(array):
#     answer = 0
#     cnt={}
#     for i in range(len(array)):
#         if array[i] not in cnt:
#             cnt[array[i]]=array.count(array[i])
#     answer=max(cnt,key=lambda x:cnt[x])
#     answer2 = cnt[answer]
#     boo=False
#     for i in cnt:
#         if cnt[i]==answer2:
#             if boo==True:
#                 answer=-1
#                 break
#             boo=True
#     return answer

# print(solution([1,2,34,2,34,54]))


# def solution(n):
#     answer = []
#     for i in range(n+1):
#         if i%2!=0:
#             answer.append(i)
            
#     return answer

# print(solution(10))

# def solution(n):
#     pi=6
#     answer=1
#     while True:
#         if pi%n!=0:
#             pi+=6
#             answer+=1
#         elif pi%n==0:
#             break
    
#     return answer

# print(solution(10))

# def solution(n):
#     ans=[]
#     for i in range(n,0,-1):
#         if n%i==0:
#             ans.append(i)
#     answer = len(ans)
#     return answer

# print(solution(100))

# def solution(my_string, n):
#     answer = ''
#     for i in range(len(my_string)):
#         for k in range(n):
#             answer+=str(my_string[i])
#     return answer

# print(solution("hello",3))

# def solution(num, k):
#     for i in str(num):
#         if int(i)==k:
#             answer=(str(num).find(i))+1
#     if str(k) not in str(num):
#         answer=-1
#     return answer

# print(solution(12345,7))




# def solution(my_string,num1,num2):
#     li=list(my_string)
#     answer=""
#     a=li[num1]
#     li[num1]=li[num2]
#     li[num2]=a
#     for i in li:
#         answer+=i
#     return answer
# print(solution("love",2,3))
# def solution(my_string):
#     answer = []
#     for i in my_string:
#         if i.isdigit():
#             answer.append(int(i))
#     answer.sort()
#     return answer
# def solution(my_string):
#     answer = ''
#     answer1 =list(my_string.lower())
#     answer1.sort()
#     for i in answer1:
#         answer+=i
    
#     return answer

# solution("Fdve")

# def solution(my_string):
#     answer = ''
#     for i in my_string:
#         if i.isupper():
            
#             answer+=i.lower()
#         elif i.islower():
            
#             answer+=i.upper()
#     print(answer)
#     return answer

# solution("CCCccccF")
# import math as m
# def solution(price):
#     if price<100000:
#         answer=price
#     elif 100000<=price<300000:
#         dis=price*0.05
#         answer=price-dis
#     elif 300000<=price<500000:
#         dis=price*0.1
#         answer=price-dis
#     elif price>=500000:
#         dis=price*0.2
#         answer=price-dis
    
    
#     return m.floor(answer)

# n = int(input())
# for i in range(1,n+1):
#     print("*"*i)

# def solution(score):
#     answer = []
#     avg=[]
#     rank=[]
    
#     for i in score:
#         a=(i[0]+i[1])/2
#         avg.append(a)
#     for i in avg:
#         cnt=1
#         for k in range(len(avg)):
#             if i<avg[k]:
#                 cnt+=1
#         rank.append(cnt)
#     print(rank)
        
    
    
    
#     return answer
# solution([[80, 70], [90, 50], [40, 70], [50, 80]])

# def solution(numbers, direction):
#     answer = numbers
#     if direction=="left":
#         a=answer[0]
#         answer.pop(0)
#         answer.insert(-1,a)
#     elif direction=="right":
#         a=answer[-1]
#         answer.pop(-1)
#         answer.insert(0,a)
#     print(answer)
#     return answer

# solution([1,2,3],"right")

# def solution(numbers, direction):
#     answer = numbers
#     if direction=="left":
#         a=answer[0]
#         answer.pop(0)
#         answer.insert(len(answer),a)
#     elif direction=="right":
#         a=answer[-1]
#         answer.pop(-1)
#         answer.insert(0,a)
#     print(answer)
#     return answer

# solution([4, 455, 6, 4, -1, 45, 6],"left")
# def solution(box, n):
#     answer = 0
    
#     a,b,c=box[0],box[1],box[2]
#     x,y,z=0,0,0
#     ju=n
#     while True:
#         if ju==a:
#             x=ju//n
#             break
#         elif ju>a:
#             x=(ju-n)//n
#             break
#         elif ju<a:
#             ju+=n
#     ju=n
#     while True:
#         if ju==b:
#             y=ju//n
#             break
#         elif ju>b:
#             y=(ju-n)//n
#             break
#         elif ju<b:
#             ju+=n
#     ju=n
#     while True:
#         if ju==c:
#             z=ju//n
#             break
#         elif ju>c:
#             z=(ju-n)//n
#             break
#         elif ju<c:
#             ju+=n
#     answer=x*y*z
#     return answer

# def solution(box, n):
#     answer = 1
#     a,b,c=box[0],box[1],box[2]
#     x,y,z=0,0,0
#     ju=n
#     f1=[a,b,c]
#     f2=[x,y,z]
#     f3=[]
#     for i ,k in zip(f1,f2):
#         while True:
#             if ju==i:
#                 k=ju//n
#                 f3.append(k)
#                 break
#             elif ju>i:
#                 k=(ju-n)//n
#                 f3.append(k)
#                 break
#             elif ju<i:
#                 ju+=n
#         ju=n    
   
#     for i in f3:
#         answer*=i
    
#     return answer
# solution([10,8,6],3)

# def solution(numbers):
#     answer,x,y=0,0,0
#     for i in range(len(numbers)):
#         a=numbers[i]
#         numbers.pop(i)
#         for k in numbers:
#             b=k*a
#             if answer<b:
#                 answer=b
#                 x=k
#                 y=a
#             elif answer==0:
#                 answer=b            
#         numbers.insert(i,a)
#     print(answer)
#     return answer
#solution([-500,2,-1000])
# def solution(numbers):
#     answer=0
#     numbers.sort()
#     return max(numbers[0]*numbers[1],numbers[-1]*numbers[-2])
# print(solution([9,-60,6]))

# def solution(cipher, code):
#     answer = ''
#     for i in range(code,len(cipher)+1,code):
#         answer+=str(cipher[i-1])
#     print(answer)    
#     return answer

# solution("dfjardstddetckdaccccdegk",4)

# def solution(letter):
#     li=[]
#     morse = { 
#     '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
#     '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
#     '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
#     '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
#     '-.--':'y','--..':'z'}
#     answer = ''
#     le=letter.split(" ")
#     for i in le:
#         answer+=morse[i]
#     return answer

# def solution(balls, share):
#     def pc(x):
#         if x==0:
#             return 1
#         else:
#             return x*pc(x-1)
#     answer = 0
#     answer=pc(balls)/pc(balls-share)*pc(share)
#     return answer
# print(solution(5,3))
# def solution(num_list, n):
#     answer = []
#     for i in range(len(num_list)//n):
#         li=[]
#         for k in range(n):
#             a=num_list[0]
#             li.append(a)
#             num_list.pop(0)
#         answer.append(li)

#     print(answer)   
#     return answer
# solution([1, 2, 3, 4, 5, 6, 7, 8],3)

# def solution(numbers, k):
#     answer = 0
#     def na(x):
#         return x%k-1
    
#     if k>len(numbers):
#         k=na(k)
    

#     answer=numbers[k-1]
            
    
#     print(answer)
#     return answer
# solution([1,2,3,4,5],2)


# def solution(numbers, k):
#     return 2 * (k - 1) % numbers[-1] + 1
# print(solution([1,2,3,4,5],2))

# def solution(my_string):
#     answer = ''
#     for i in my_string:
#         if i not in answer:
#             answer+=i
#     return answer

# solution("people")
# def solution(my_str, n):
#     answer = []
#     for i in range(len(my_str)//n):
#         st=""
#         for k in range(n):
#             a=my_str[0]
#             st+=a
#             my_str=my_str.replace(a,"",1)
        
#         if st!="":
#             answer.append(st)
#     if my_str!="":
#         answer.append(my_str)
#     return answer

# solution("abc1Afdsafffff",3)



# def solution(s):
#     answer1 = ''
#     answer=""
#     for i in s:
#         if s.count(i)==1:
#             answer1+=i
#     answer1=list(answer1)
#     answer1.sort()
#     for i in answer1:
#         answer+=i
        
#     return answer
# print(solution("hello"))
# def solution(array, n):
#     answer = 0
#     abs1=[]
#     for i in array:
#         abs1.append(abs(n-i))
#     min1=min(abs1)
#     for i in range(len(abs1)):
#         if abs1[i]==min1:
#             answer=array[i]
#             break
#     return answer
# solution([1,2,3,4],2)
            
# def solution(spell, dic):
#     answer = 2
#     for i in dic:
#         if len(spell)==len(i):
#             for k in spell:
#                 if k in i:
#                     answer=1
#                 else:
#                     answer=2
#                     break


            
#     print(answer)
#     return answer
# solution(["p", "o", "s"], ["sod", "eocd", "qixm", "adio", "soo"])



# def sosu(x):
#         cnt=0
#         for i in range(1,x+1):
#             if x%i==0:
#                 cnt+=1
#         if cnt==2:
#             return True
#         else:
#             return False

        
# def bun(x):
#     n=2
#     a=[]
#     while n<=x:
#         if x%n==0:
#             a.append(n)
#             x/=n
#         else:
#             n+=1
#     return a
        
         

# solution=lambda a,b:(b*2).find(a)       
# print(solution("hello","ohell"))

# def solution(numbers):
    
#     mun=["zero","one","two","three","four","five","six","seven","eight","nine"]
#     for i in range(len(mun)):
#         numbers=numbers.replace(mun[i],str(i))
    
#     return numbers
# solution("onetwothreefourfivesixseveneightnine")
# def solution(my_string):
#     my_string=my_string.split(" ")
#     li=[]
#     bu=[]
#     for i in my_string:
#         if i.isdigit():
#             li.append(i)
#         else:
#             bu.append(i)
#     answer=li[0]
#     answer=int(answer)
#     for i in range(len(bu)):
#         if bu[i]=="+":
#             answer+=int(li[i+1])
#         else:
#             answer-=int(li[i+1])
#     print(answer)
#     return answer
# solution("3 + 0 - 100")

# def solution(s):
#     answer = 0
#     s=s.split(" ")
#     zl=[]
#     for i in range(len(s)):
#         if s[i]=="Z":
#             zl.append(i)
#     z1=list(map(lambda x :x-1,zl))
#     for i in range(len(s)):
#         if i in z1:
#             continue
#         else:
#             if s[i]!="Z":
#                 answer+=int(s[i])
#     print(answer)
#     return answer

# solution("1 2 3 Z Z")

# def solution(quiz):
#     answer = []
#     for i in quiz:
#         k=i.split(" ")
#         if k[1]=="+":
#             sum=int(k[0])+int(k[2])
#         else:
#             sum=int(k[0])-int(k[2])
#         if sum==int(k[4]):
#             answer.append("O")
#         else:
#             answer.append("X")
        
#     return answer
# solution(["3 - 4 = -3", "5 + 6 = 11"])


# def solution(keyinput, board):
#     answer = []
#     x,y=0,0
#     for i in keyinput:
#         if i=="up":
#             if y<(board[1])//2:
#                 y+=1
#         elif i=="down":
#             if abs(y)<abs((board[1])//2):
#                 y-=1
#         elif i=="left":
#             if abs(x)<abs((board[0])//2):
#                 x-=1
#         else:
#             if x<(board[0])//2:
#                 x+=1
#     answer.append(x)
#     answer.append(y)
#     print(answer)
#     return answer
# solution(["down", "down", "down", "down", "down"],[2,2])

# def soin(x):
#     a=[]
#     for i in range(2,x+1):
#         if x%i==0:
#             x=x/i
#             if i not in a:
#                 a.append(i)
#     print(a)
#     return a

# soin(100)
# def ki(x,y):
#         for i in range(min(x,y),0,-1):
#             if x%i==0 and y%i==0:
#                 return i

# print(ki(5,10))


# def solution(a, b):
#     answer = 2
# def ki(x,y):
#     for i in range(min(x,y),0,-1):
#         if x%i==0 and y%i==0:
#             return i
# ki(10,20)
#     def soin(x):
#         a=[]
#         n=2
#         while n<=x:
#             if x%n==0:
#                 x=x/n  
#                 if n not in a:
#                     a.append(n)
#             else: 
#                 n+=1
#         return a
#     bun=b/ki(a,b)
#     mo=soin(bun)
#     if len(mo)==2:
#         if 2 in mo and 5 in mo:
#             answer=1
#     if len(mo)==1:
#         if 2 in mo or 5 in mo:
#             answer=1
        
                  
    
# #     return answer
# num=[10000,20,47,40,6,10,7000]
# n=30
# num1=sorted(num,key=lambda x: abs(x-n))

# print(num1)
# sorted()
# dot=[[1, 1], [2, 1], [2, 3], [3, 2]]    
# print(max(dot))  

# def solution(n):
#     answer,a,b=0,1,1
#     dic={}
#     while(n not in dic):
#         if "3" in str(b)or b%3==0:
#             while "3" in str(b) or b%3==0:
#                 b+=1
#             dic[a]=b
#         else:
#             dic[a]=b
#         a+=1
#         b+=1
#     answer=dic[n]
#     return answer
# solution(11)
# def solution(num, total):
#     answer = []
#     p=total//num
#     n1=num//2
#     if num%2!=0:
#         for i in range(n1,0,-1):
#             answer.append(p-i)
#         answer.append(p)
#         for i in range(1,n1+1):
#             answer.append(p+i)
#     else:
#         for i in range(n1-1,0,-1):
#             answer.append(p-i)
#         answer.append(p)
#         for i in range(1,n1+1):
#             answer.append(p+i)

#     return answer

#solution(5,5)
# def solution(polynomial):
#     answer = ''
#     ex=0
#     plus=True
#     sut=0
#     a=polynomial.split(" ")
#     if "-" in a[0]:
#         plus=False
#     for i in a:
#         if i=="+":
#             plus=True
#         elif i=="-":
#             plus=False
#         elif i.isdigit():
#             if plus:
#                 sut+=int(i)
#             else:
#                 sut-=int(i)
#         elif i.replace("-","").isdigit():
#             sut=int(i.replace("-",""))*-1
#         elif "x" in i:
#             if len(i)==1:
#                 if plus:
#                     ex+=1
#                 else:
#                     ex-=1
#             else:
#                 if "-" in i:
#                     am=i.replace("-","")
#                     ex-=int(am.replace("x",""))
#                 elif plus:
#                     ex+=int(i.replace("x",""))
#                 else:
#                     ex-=int(i.replace("x",""))
#     if ex==-1:
#             if sut ==0:
#                 answer="-x"
#             elif sut <0:
#                 answer="-x - {}".format(abs(sut))
#             else:
#                 answer="-x + {}".format(sut)
#     if ex<-1:   
#         if sut==0:
#             answer="{}x".format(ex)
#         elif sut<0:
#             answer="{}x - {}".format(ex,abs(sut))
#         else:
#             answer="{}x + {}".format(ex,sut)
#     if ex==0:
#         answer=sut
#     if ex==1:
#         if sut>0:
#             answer="x + {}".format(sut)
#         elif sut==0:
#             answer="x"
#         else:
#             answer="x - {}".format(abs(sut))
#     if ex>1:
#         if sut>0:
#             answer="{}x + {}".format(ex,sut)
#         elif sut==0:
#             answer="{}x".format(ex)
#         else:
#             answer="{}x - {}".format(ex,abs(sut))
#     print(answer)
#     return answer
# solution("")


2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
# def solution(polynomial):
#     ex = 0
#     sut = 0
#     li=polynomial.split(" + ")
#     for i in li:
#         if 'x' in i:
#             if len(i) != 1:
#                 ex += int(i[:-1]) - 1
#             ex += 1 
#         else:
#             sut += int(i)
#     answer = []
#     if ex != 0:
#         answer.append('x' if ex == 1 else f'{ex}x')
#     if sut != 0:
#         answer.append(str(sut))
#     answer= ' + '.join(answer) if answer else '0'
#     print(answer)
#     return answer

# def solution(lines):
#     answer = 0
#     c=0
#     red=[]
#     green=[]
#     blue=[]
#     for i in range(lines[0][0],lines[0][1]+1):
#         red.append(i)
#     for i in range(lines[1][0],lines[1][1]+1):
#         green.append(i)
#     for i in range(lines[2][0],lines[2][1]+1):
#         blue.append(i)
#     red=set(red)     
#     green=set(green)
#     blue=set(blue)
#     rg=red&green
#     gb=green&blue
#     rb=red&blue
#     li=[rg,gb,rb]
#     for i in li:
#         if len(i)>=2:
#             answer+=len(i)-1
#     l2=red&green&blue
#     if len(l2)>=2:
#         c+=(len(l2)-1)
#     return answer-c*2
# solution([[0, 5], [3, 9], [1, 10]])
# def solution(babbling):
#     answer = 0
#     ab=[]
#     def rep(x):
#         a=x.replace("aya"," ")
#         a=a.replace("ye"," ")
#         a=a.replace("woo"," ")
#         a=a.replace("ma"," ")
#         return a
#     for i in babbling:
#         ab.append(rep(i))
#     for i in ab:
#         cnt=0
#         for k in i:
#             if k==" ":
#                 cnt+=1
#         if cnt==len(i):
#             answer+=1

#     print(answer)
#     return answer
# solution(["ayaye", "uuuma", "ye", "yemawoo", "ayaa"])


# def pos(x, y, max):
#     ali = []

#     for a in range(-1,2):
#         for b in range(-1,2):
#             loc = x+a, y+b
#             if 0 <= loc[0] < max and 0 <= loc[1] < max:
#                 ali.append(loc)
#     return ali


# def solution(board):
#     ge = []
#     n = len(board)
#     for i in range(n):
#         for j in range(n):
#             if board[i][j]==1:
#                 ge.append((i,j))
#     for x, y in ge:
#         arounds = pos(x, y, n)
#         for a, b in arounds:
#             board[a][b] = 1
#     sum=0
#     for i in range(n):
#         for k in range(n):
#             if board[i][k]==0:
#                 sum+=1

#     return sum
def gpos(x,y,max):
    li=[]
    for i in range(-1,2):
        for k in range(-1,2):
            pos=x+i,y+k
            if 0<=pos[0]<max and 0<=pos[1]<max:
                li.append(pos)
    return li

def solution(board):
    n=len(board)
    ge=[]
    for i in range(n):
        for k in range(n):
            if board[i][k]==1:
                ge.append((i,k))
    
    for x,y in ge:
        we=gpos(x,y,n)
        for i,k in we:
            board[i][k]=1
    sum=0
    for i in range(n):
        for k in range(n):
            if board[i][k]==0:
                sum+=1
    print(sum)
    return sum

solution([[0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]])




