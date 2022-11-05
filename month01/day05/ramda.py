# def call_10(func):
#     for i in range(10):
#         func()

# def print_h():
#     print("ㅎㅇ")

# call_10(print_h)



power =lambda x:x*x
# def power(x):
#     return x*x
under_3=lambda x:x<3
# def under_3(x):
#     return x<3

list_a=[1,2,3,4,5]

out_a=list(map(power,list_a))
out_b=list(filter(under_3,list_a))

#print(out_a,out_b)

