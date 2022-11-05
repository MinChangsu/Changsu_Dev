# def test():
#     print("함수가호출됨")
#     yield "test"

# print("a지점 통과")
# test()
# print("b지점 통과")
# test()

# print(test())

# for i in test():
#     print(i)
def test():
    print("a")
    yield 1
    print("b")
    yield 2
    print("c")

out=test()

print("d")
a=next(out)
print(a)
print("e")
b=next(out)
print(b)
print("f")
c=next(out)
print(c)

next(out)
