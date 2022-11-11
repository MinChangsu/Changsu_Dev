package page3;
//문자열 my_string과 정수 num1, num2가
//매개변수로 주어질 때, my_string에서 인덱스
//num1과 인덱스 num2에 해당하는 문자를 바꾼 
//문자열을 return 하도록 solution 함수를 완성해보세요.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qz46 {
	public static String solution(String my_string, int num1, int num2) {
        String answer = "";
       List<String>A=new ArrayList<>(Arrays.asList(my_string.split("")));
       String in1=A.get(num1);
       String in2=A.get(num2);
      A.set(num2, in1);
      A.set(num1, in2);
       for(String s:A)
    	   answer+=s;
        return answer;
    }
	public static void main(String[] args) {

solution("happy", 0, 1);
	}

}
