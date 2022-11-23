const express=require("express")
const myrouter=express.Router()


myrouter.route("/").get((request,response)=>{
    response.send("랜딩페이지에 들어오셨네요")
})
myrouter.route("/sise").get((request,response)=>{
    response.send("국내 증시 페이지에 들어오셨네요")
})
myrouter.route("/world").get((request,response)=>{
    response.send("해외 증시 페이지에 들어오셨네요")
})
module.exports=myrouter