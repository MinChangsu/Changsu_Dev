function settext(text){
    let p=document.querySelector("p#text")
    p.textContent=text
}
function setfoodtext(food){
    
    return `맛있는 ${food}`
}
let p=document.querySelector("p#text")
let myfood="돈까스"
let desc="맛잇고 바삭한"
myfood=`${desc} ${myfood}`
settext(setfoodtext(prompt("먹고싶은음식")))
