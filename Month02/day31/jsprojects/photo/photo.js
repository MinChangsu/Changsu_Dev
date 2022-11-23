const beginning = document.getElementById("beginning")
const callBtn = document.getElementById("call-btn")
const prevBtn = document.getElementById("prev")
const nextBtn = document.getElementById("next")
const photoDiv = document.getElementById("photo")


let photos=[]
const numOfPhoto=8;
let photoIndex=0;
const request=new XMLHttpRequest();
let url=`https://dog.ceo/api/breeds/image/random/${numOfPhoto}`
let isPushed=false;


callBtn.addEventListener("click",function(e){
    if(isPushed){
        return; // 이미 버튼이 눌려진 상태에서 또 누른 거라면, 이 함수는 강제종료!
      }
      isPushed = true;
    request.open("get",url)
    request.send()

    setTimeout(function(){
        beginning.classList.remove("beginning")
    },1500)
})

request.addEventListener("load",function(){
    let jsphoth=JSON.parse(request.response)
    jsphoth.message.forEach(element => {
        photos.push(element)
    })
    photoDiv.style.backgroundImage=`url(${photos[photoIndex]})`


})
prevBtn.addEventListener("click", function(){
  
    if(photoIndex == 0){
      photoIndex = numOfPhoto - 1
      photoDiv.style.backgroundImage = `url(${photos[photoIndex]})`
      return;
    }
  
    photoIndex -= 1
    photoDiv.style.backgroundImage = `url(${photos[photoIndex]})`
  })
  nextBtn.addEventListener("click", function(){
    
    if(photoIndex == numOfPhoto - 1){
      photoIndex = 0
      photoDiv.style.backgroundImage = `url(${photos[photoIndex]})`
      return;
    }
  
    photoIndex += 1
    photoDiv.style.backgroundImage = `url(${photos[photoIndex]})`
  })
photoDiv.addEventListener("click",function(){
    if(confirm("사진주소를보시려면 확인 사진을 전체화면으로 보시려면 취소를 눌러주세요")){
        alert(`${photos[photoIndex]}`)

    }else{
        document.querySelector(".app").classList.add("abc")
        document.body.style.backgroundImage=`url(${photos[photoIndex]})`
        document.body.style.backgroundSize ="100% 100%"
        document.body.style.backgroundRepeat = "no-repeat"
        document.getElementById("back").style.display="block"
        document.querySelector(".remote").style.display="none"
}
})

document.getElementById("back").addEventListener("click",function(){
   
        document.querySelector(".app").classList.remove("abc")
        document.body.style.backgroundImage="url(./bag.jpg)"
        document.getElementById("back").style.display="none"
        document.querySelector(".remote").style.display="block"
        

        
    
})