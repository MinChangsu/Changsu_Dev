const pet=["강아지","고양이","거북이","열대어"]
pet.forEach(function(apet,idx){
    console.log(apet,idx)
})

let result1=pet.map(function(apet){
    return `귀여운${apet}`
})

let result2=pet.filter((apet,ipx)=>{
    if(ipx%2!=0){
        return true
    }
    else return false
})