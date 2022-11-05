from pickle import TRUE


a=3
b=5

c=a
a=b
b=c
format_a="{}만원".format(5000)
format_b="파이썬 열공하여 첫 연봉{}만원 만들기".format(5000)
format_c="{}{}{}".format(3000,4000,5000)
format_d="{}{}{}".format(1,"문자열",True)

print(format_a)
print(format_b)
print(format_c)
print(format_d)

# "{}".format(100)
# "{:d}".format(100)
# "{:20d}".format(100)
# "{:+d}".format(100)
# "{: d}".format(100)
print("{:=+05d}".format(100))

name="민경서"

print(f"제 이름은 {name}입니다")



