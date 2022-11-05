# input_a=float(input("첫번째 숫자>"))
# input_b=float(input("두번쨰 숫자>"))

# print("덧셈결과:",input_a+input_b)
# print("뺄셈결과:",input_a-input_b)
# print("곱셈결과:",input_a*input_b)
# print("나눗셈결과:",input_a/input_b)

#숫자입력

raw_input=input("inch 단위의 숫자를 입력해주세요: ")
#입력받은 데이터를 숫자 자료형으로 변경하고, cm단위로 변경
inch=int(raw_input)
cm = inch*2.54

print(inch,"inch는 cm단위로",cm,"cm입니다")