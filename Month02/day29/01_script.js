let food=document.querySelector("input[name='food']");
let push=document.querySelector("input[type='submit']");
let form=document.querySelector("form");
let ul=document.querySelector("ul");

push.addEventListener("click",function(e){
    e.preventDefault()
    let li=document.createElement("li");
    li.textContent=food.value;
    food.value=""
    ul.append(li);
    console.log(food.value)
    
})
