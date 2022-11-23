// let myAge=18
// let urAge=prompt("난 18살인데 넌 몇살이야?");
// if(myAge==urAge){
//     alert("우린 동갑내기 친구구나");
// }
// else{alert("나이는 다르지만 친하게 지내요");}
let cAge =parseInt(prompt("승객의 나이는?"))
let dyrma=document.querySelector("p")
let dyrma1=document.getElementsByTagName("p")
if(cAge<8){
    dyrma.textContent=("너는어리니까 무료야")
    dyrma.style.color="red"
}
else if(cAge<20){
    dyrma.textContent=("청소년이니까 700원")
}
else if(cAge<80){
    dyrma.textContent=("성인요금 1250")
}
else 
    {dyrma.textContent=("어르시분들은 무료입니다.")}

