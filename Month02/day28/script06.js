// while(confirm("반복하고싶나요?")){
//     console.log("반복중이다")
// }
let fltmxm=document.querySelectorAll("li")
console.log(fltmxm)
for(let i=0;i<5;i+=1){
fltmxm[i].textContent=prompt("먹고싶은음식은?")
}