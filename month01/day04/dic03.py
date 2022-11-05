dic={}
print("요소추가이전",dic)

dic["name"]="새로운 이름"
dic["head"]="새로운 정신"
dic["body"]="새로운 몸"

print("요소추가이후",dic)

dic_a={
    "name":"7D 건조 망고",
    "type":"당절임"
}
print("요소제거이전",dic_a)
del dic_a["name"]
del dic_a["type"]

print("요소제거이후",dic_a)