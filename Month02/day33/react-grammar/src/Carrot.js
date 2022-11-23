import React from "react";
//순수하게 캐롯 내부에서만 작성한 코드로 화면상에 네모가 표시되게 만들어보자

const nemo={
    width:"100px",
    height:"100px",
    backgroundColor:"tomato",
    border:"3px solid black"
}



function Carrot(){
    return <div style={nemo} className="ne"></div>
}

export default Carrot;