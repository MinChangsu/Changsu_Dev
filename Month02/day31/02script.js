const button=document.querySelector("button")
const request =new XMLHttpRequest()

button.addEventListener("click",function(){
    request.open("get","https://dog.ceo/api/breeds/image/random/3")
request.send()
})
request.addEventListener("load",function(e){
    const data=JSON.parse(e.target.response)
   
    data.message.forEach(i => {
        let img=document.createElement("img")
        img.src=i
        img.style.width="200px"
        img.style.height="200px"
        document.body.appendChild(img)
        
    })
        
    
})