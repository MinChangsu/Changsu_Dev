const ul=document.querySelector("ul")
const form=document.querySelector("form")
let mytodos=[]
function del(cid){
    mytodos=mytodos.filter(function(atodo){
        return atodo.todoid !== cid

})
painttodo()
savetodos()
}
function ham(cid){
    mytodos = mytodos.map(function(atodo){
        return atodo.todoid!==cid?atodo:{...atodo,tododone:!atodo.tododone}
            
    })

painttodo()
savetodos()
}
function savetodos(){
    const todosting = JSON.stringify(mytodos)
    localStorage.setItem('myTodos', todosting)
  }
function loadTodos(){
    const myTodos = localStorage.getItem('myTodos') 
    mytodos = myTodos !== null ? JSON.parse(myTodos) : mytodos
    painttodo()}


function painttodo(){
    ul.innerHTML=""
    mytodos.forEach((atodo) => {
    const li=document.createElement("li")
    const span=document.createElement("span")
    li.textContent=atodo.todocontent
    span.textContent="x"
    li.classList.add(atodo.tododone?"done":"yet")
    li.appendChild(span)
    span.addEventListener("click",function(){
        del(atodo.todoid)
    })
    li.addEventListener("click",function(){
        ham(atodo.todoid)
    })
    ul.appendChild(li)
    })
    
}




form.addEventListener("submit",function(e){
    
    e.preventDefault()
    const todo={
        todocontent:e.target.todo.value,
        todoid:new Date().getTime(),
        tododone:false
    }
    mytodos.push(todo)
    e.target.todo.value=""
    painttodo()
    savetodos()
})

loadTodos()

