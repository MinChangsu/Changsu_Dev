# with open("talk.txt","w")as f:
#     f.write("명언명언명언")

# with open("talk.txt","r")as f:
#     m=f.read()

# print(m)
name="m"
weight=70
height=170
bmi=20
re="fd"
print('\n'.join(["이름:{0}",
"몸무계:{1}",
"키:{2}",
"BMI:{3}",
"결과:{4}"]).format(name,weight,height,bmi,re))
