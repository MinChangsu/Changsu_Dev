//규칙4 style은 객체로 class 대신 classname으로
import React from "react";
const ulstyle={
    color:"red",
    backgroundColor:"yellow"
}

function Banana(){
    return <div>
        <ul style={ulstyle}
        className="food">
            <li>바나나</li>
            <li>오렌지</li>
            <li>사과아</li>
        </ul>
    </div>
}

export default Banana