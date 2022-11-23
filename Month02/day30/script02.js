let todolist=[]
const ul=document.querySelector("ul")
document.querySelector("form").addEventListener("submit",function(e){
    e.preventDefault()
    let todo={
        todocontent:e.target.todo.value,
        tododate:new Date()
    }
    todolist= [...todolist,todo]
    let li=document.createElement("li")
    li.textContent=todo.todocontent
    ul.appendChild(li)
    e.target.todo.value=""


    
    
})