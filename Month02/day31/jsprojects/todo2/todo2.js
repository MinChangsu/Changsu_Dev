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
function ham2(cid){
    let todo1;
    for(let i=0;i<mytodos.length;i+=1){
        if(cid==mytodos[i].todoid)
        todo1=mytodos[i];
    }
    mytodos=mytodos.filter(function(atodo){
        return atodo.todoid !== cid})
    todo1={...todo1,tododone:!(todo1.tododone)}
        mytodos.push(todo1)
    

    

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
        ham2(atodo.todoid)
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

