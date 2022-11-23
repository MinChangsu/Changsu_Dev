//https://dog.ceo/api/breed/견종/image/random
let mybreed="beagle"
let myurl=`https://dog.ceo/api/breed/${mybreed}/images/random`
let select=document.querySelector("select")

select.addEventListener("change",function(e){
    mybreed=e.target.value
})
const request=new XMLHttpRequest()
const button=document.querySelector("button")

button.addEventListener("click",function(){
let myurl=`https://dog.ceo/api/breed/${mybreed}/images/random`
request.open("get",myurl)
request.send()
})
request.addEventListener("load",function(){
let data=JSON.parse(request.response)
let img=document.createElement("img")
img.src=data.message
img.style.width="200px"
img.style.height="200px"
document.body.appendChild(img)
})