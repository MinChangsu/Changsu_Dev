package page3;

import java.util.*;

//문자열 my_string이 매개변수로 주어집니다.
//my_string에서 중복된 문자를 제거하고 하나의 
//문자만 남긴 문자열을 return하도록 solution
//함수를 완성해주세요.

public class Qz50 {
    public static String solution(String my_string) {
        String answer="";
       String [] a= Arrays.stream(my_string.split("")).distinct().toArray(String[]::new);
       for(String s:a)answer+=s;
       return answer;
    }
	public static void main(String[] args) {
solution("happy");
	}

}
