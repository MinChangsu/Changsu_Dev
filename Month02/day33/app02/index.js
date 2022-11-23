const express=require("express")
const app=express()
const myrouter=require("./myrouter")
//홈주소를 축으로 마이라우터가 라우팅을 처리하겠다
app.use("/",myrouter)
app.listen(4003,()=>{
    console.log("4003번에서 구동중")
})