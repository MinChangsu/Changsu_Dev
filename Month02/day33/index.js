const { request, response } = require("express")
const express=require("express")
const app=express()
const bodyparser=require("body-parser")
//post 방식으로 받은 요청데이터는 parsing 작업을 거져야한다.
//데이터 중첩시 중첩된 데이터까지 해석할지 여부 
app.use(bodyparser.urlencoded({extended:false}))
app.use(bodyparser.json())
//요청이 오면 처리해보자(미들웨어라고도함)
app.use((request,response)=>{
    const {name,town}=request.body

    response.send(`${town}에 사는${name}씨 반가워요!`)
})
app.listen(4000,()=>{
    console.log("4000번 포트에서 서버 구동됨 ")
})