# class Student:
#     def __init__(self,name,score):
#         self.name=name
#         self.score=score
#     def __eq__(self,va):
#         return self.score==va
#     def __ne__(self,va):
#         return self.score!=va
#     def __gt__(self,va):
#         return self.score>va
#     def __ge__(self,va):
#         return self.score>=va
#     def __lt__(self,va):
#         return self.score<va
#     def __le__(self,va):
#         return self.score<=va


# class StudentList:
#     def __init__(self):
#         self.students=[]
#     def append(self,student):
#         self.students.append(student)    
#     def get_average(self):
#         sum=0
#         for i in self.students:
#             sum +=i.score
#         return sum/len(self.students)
#     def get_first_by_score(self):
#         return max(self.students)
#     def get_last_by_score(self):
#         return min(self.students)
            

# students=StudentList()

# students.append(Student("구름",100))
# students.append(Student("별",49))
# students.append(Student("초코",81))
# students.append(Student("아지",90))

# print(students.get_average())
# print(students.get_first_by_score().name)
# print(students.get_last_by_score().name)

# class Student:
#     def __init__(self,name,score):
#         self.name=name
#         self.score=score
   


# class StudentList:
#     def __init__(self):
#         self.students=[]
#     def append(self,student):
#         self.students.append(student)    
#     def get_average(self):
#         sum=0
#         for i in self.students:
#             sum +=i.score
#         return sum/len(self.students)
#     def get_first_by_score(self):
#         return max(self.students,key=lambda x:x.score)
#     def get_last_by_score(self):
#         return min(self.students,key=lambda x:x.score)
            

# students=StudentList()

# students.append(Student("구름",100))
# students.append(Student("별",49))
# students.append(Student("초코",81))
# students.append(Student("아지",90))

# print(students.get_average())
# print(students.get_first_by_score().name)
# print(students.get_last_by_score().name)

# import queue


# class Stack:
#     def __init__(self):
#         self.list=[]

#     def push(self,item):
#         self.list.append(item)
#     def pop(self):
        
#         return self.list.pop()

# stack=Stack()
# stack.push(10)
# stack.push(20)
# stack.push(30)

# print(stack.pop())

# class Queue:
#     def __init__(self):
#         self.list=[]
#     def enqueue(self,item):
#         self.list.insert(0,item)
#     def dequeue(self):
#         self.list.pop()

# queue=Queue()
# queue.enqueue(10)
# queue.enqueue(20)
# queue.enqueue(30)
# queue.enqueue(40)
# queue.enqueue(50)
# queue.enqueue(60)

# queue.dequeue()
# print(queue.list)
