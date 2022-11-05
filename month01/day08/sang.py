class Parent:
    def __init__(self):
        self.value ="테스트"
        print("parent 클래스의 __init__메소드가 호출")
    def test(self):
        print("parent 클래스의 test()메소드")

class Child(Parent):
    #메소드 오버라이딩:상속받은 메소드를 다시만들기
    def __init__(self):
        super().__init__()
        print("child 클래스의 __init__메소드 호출")

child=Child()
child.test()
print(child.value)