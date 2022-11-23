const ul=document.querySelector("ul")
let todolist=[]
let data=localStorage.getItem("todolist")
todolist=data == null?[]:JSON.parse(data)
ul.innerHTML=""
todolist.forEach(function(todo){
    let li =document.createElement("li")
    li.textContent=`${todo.todocontent} (${todo.tododate})`
    ul.appendChild(li)}
);



document.querySelector("form").addEventListener("submit",function(e){
    e.preventDefault()
    let todo={
        todocontent:e.target.todo.value,
        tododate:new Date()
    }
    todolist= [...todolist,todo]
    let li=document.createElement("li")
    li.textContent=`${todo.todocontent} (${todo.tododate})`
    localStorage.setItem("todolist",JSON.stringify(todolist))
    ul.appendChild(li)
    e.target.todo.value=""


    
    
})