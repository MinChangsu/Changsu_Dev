// function Dog(n,b){
//     this.dname =n;
//     this.breed =b;
// }

// let d =new Dog("콩이","시츄");
let now =new Date();
let year =now.getFullYear()
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
year=year<10? `0${year}`:`${year}`

let h1 =document.createElement("h1");

h1.textContent=`${year}/${month}/${date} ${hour}:${minute}:${second}`
document.body.appendChild(h1)




let timer=setInterval(function b(){
    console.log("!")
},1000)