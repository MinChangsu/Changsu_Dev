// 요소 선택 및 상수 선언
const numbersDiv = document.querySelector('.numbers')
const drawButton = document.querySelector('#draw')
const resetButton = document.querySelector('#reset')
let lottoNumbers = []
const colors = ['orange', 'skyblue', 'red', 'purple', 'green']
const img=document.querySelector("img1");
let opacity =0;
let intervalID=0;
let dang=[6,7,9,11,17,18]

function show(){
  var div = document.getElementById("img1");
  opacity = Number(window.getComputedStyle(div).getPropertyValue("opacity"));
  
  if(opacity<1){
        //Fade in 핵심 부분
    opacity = opacity+0.1;
    div.style.opacity=opacity;
    //img.style.opacity=opacity;
  }
  else{
    clearInterval(intervalID);
  }
}	
function hide(){
  var div = document.getElementById("img1");
  opacity = Number(window.getComputedStyle(div).getPropertyValue("opacity"));
  
  if(opacity>0){
          //Fade out 핵심 부분
    opacity = opacity-0.1;
    div.style.opacity=opacity;
    //img.style.opacity=opacity;
  }
  else{
    clearInterval(intervalID);
  }
}
hide();
// paintNumber 함수
function paintNumber(number){
  const eachNumDiv = document.createElement('div')
  eachNumDiv.classList.add('eachnum')
  let colorIndex = Math.floor(number / 10)
  eachNumDiv.style.backgroundColor = colors[colorIndex]
  eachNumDiv.textContent = number
  numbersDiv.appendChild(eachNumDiv)
}

// 추첨 버튼 클릭 이벤트 핸들링
drawButton.addEventListener('click', function(){

  if(lottoNumbers.length == 6) {
    numbersDiv.classList.add("animate__animated","animate__bounce")
    numbersDiv.addEventListener('animationend', function() {
      numbersDiv.classList.remove("animate__animated","animate__bounce")
    });
    return;}
  intervalID = setInterval(show,100);

  while(lottoNumbers.length < 6){
    let ran = Math.floor(Math.random() * 45) + 1
    if(lottoNumbers.indexOf(ran) === -1){
      lottoNumbers.push(ran)
     // paintNumber(ran)
    }

  }
  lottoNumbers.sort((a, b) => a - b)

  console.log(lottoNumbers)
  for(let i=0;i<6;i+=1){
    paintNumber(lottoNumbers[i])}
    numbersDiv.classList.add("animate__animated","animate__bounce")
    
    numbersDiv.addEventListener('animationend', function() {
      numbersDiv.classList.remove("animate__animated","animate__bounce")
      let cnt=0;
    for(let i=0;i<lottoNumbers.length;i+=1){
      if(lottoNumbers[i]==dang[i]){
        cnt+=1;
      }}
    if(cnt==0){
      alert("낙점되었습니다")
      cnt=0
    }
    else{
      alert(`${cnt}개 적중 ㅊㅊ`)
      cnt=0
    }
    })
    
    
    
})

// 다시 버튼 클릭 이벤트 핸들링
resetButton.addEventListener('click', function(){
  intervalID = setInterval(hide,100);

  lottoNumbers.splice(0, 6)
  numbersDiv.innerHTML = ""
  
})