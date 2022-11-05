def test(fun):
    def wrapper():
        print("인사시작")
        fun()
        print("인사끝")
    return wrapper

@test

def hello():
    print("hello")

hello()

