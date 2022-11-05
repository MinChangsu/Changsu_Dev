import turtle
#커서 꾸미기 메소드들
cursor=turtle.Turtle()
cursor.color("green")
cursor.shape("turtle")
canvas=cursor.getscreen()
cursor.penup()
ispenup=True

def up1():
    cursor.forward(50)
def down1():
    cursor.backward(50)
def ri1():
    cursor.right(50)
def le1():
    cursor.left(50)
def toggledraw():
    
    if cursor.isdown():
        cursor.penup()
    else:
        cursor.pendown()
        


    

#그리기 메소드
# cursor.forward(200)
# cursor.backward(200)
# cursor.right(90)
# cursor.left(90)

canvas.onkeypress(up1,"Up")
canvas.onkeypress(down1,"Down")
canvas.onkeypress(ri1,"Right")
canvas.onkeypress(le1,"Left")
canvas.onkeypress(toggledraw,"space")


#화면에 초점유지
canvas.listen()
#프로그램 유지
canvas.mainloop()

