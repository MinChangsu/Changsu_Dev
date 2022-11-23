const { request, response } = require("express")
const express=require("express")
const app=express()
const myrouter =express.Router()
//__dirname: 프로젝트 폴더주소
// app.use("/page",express.static(__dirname + "/views/index.html"))
app.set("views",__dirname+"/views")
app.set("view engine","pug")

myrouter.route("/").get((request,response)=>{
    response.render("index")
})

app.use("/",myrouter)
app.listen(4004,()=>console.log("4004번포트에서 구동중"))