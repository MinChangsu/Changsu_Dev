def print_a():
    print("안녕하세요")

print_a()

def print_b(value,n):
    for i in range(n):
        print(value)

print_b("안녕",5)

def print_c(n,*txt):
    for i in range(n):
        print(txt)

print_c(3,"안녕","하세요","ㅎ")

def p (v,n=2):
    for i in range(n):
        print(v)

p("안녕하세요")

def a(*txt,n=2):
    for i in range(n):
        print(txt)

a("사과","포도",n=2)

def a(n):
    return n

b=a(5)

print(b)

