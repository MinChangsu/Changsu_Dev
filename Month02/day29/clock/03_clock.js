
function tim(){
    let now =new Date();
    
    let month =now.getMonth()+1;
    let date =now.getDate()
    let hour =now.getHours()
    let minute =now.getMinutes()
    let second =now.getSeconds()
    
    month=month<10?`0${month}`:`${month}`
    date=date<10? `0${date}`:`${date}`
    hour=hour<10? `0${hour}`:`${hour}`
    minute=minute<10? `0${minute}`:`${minute}`
    second=second<10? `0${second}`:`${second}`
    
    
    let formatt=`${hour}:${minute}:${second}`
    let mon=document.querySelector(".mon")
    let day=document.querySelector(".day")
    let time=document.querySelector(".time")    

    mon.textContent=month
    day.textContent=date
    time.textContent=formatt;
}
function tim2(){
    let now=new Date();
    let month =now.getMonth()+1;
    let date =now.getDate()
    let hour =now.getHours()
    let minute =now.getMinutes()
    let second =now.getSeconds()
    
    month=month<10?`0${month}`:`${month}`
    date=date<10? `0${date}`:`${date}`
    hour=hour>12? hour-12:hour
    hour=hour<10? `0${hour}`:`${hour}`
    minute=minute<10? `0${minute}`:`${minute}`
    second=second<10? `0${second}`:`${second}`

    
    
    
    let formatt=`${hour}:${minute}:${second}`
    let mon=document.querySelector(".mon")
    let day=document.querySelector(".day")
    let time=document.querySelector(".time")  
    mon.textContent=month
    day.textContent=date
    time.textContent=formatt;
}
let istim=true;
tim()
let timer=setInterval(tim,1000)

let button=document.querySelector("input[type='submit']")
button.addEventListener("click",function(){
if(istim){
clearInterval(timer);
tim2();
timer=setInterval(tim2,1000);
istim=false;}
else{
    clearInterval(timer);
    tim();
timer=setInterval(tim,1000);
istim=true;
}
})



