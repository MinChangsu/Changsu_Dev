package page2;
//문자열 my_string과 정수 n이 매개변수로 주어질 때,
//my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 
//return 하도록 solution 함수를 완성해보세요.
import java.util.*;
public class Qz19 {
	public static String solution(String my_string, int n) {
       List<String>a=new ArrayList<>();
       for(int i=0;i<my_string.length();i++)
    	   a.add(String.valueOf(my_string.charAt(i)));
       String answer="";
       for(String s:a) {
    	   for(int i=0;i<n;i++)
    		   answer+=s;}
    	return answer;   
    }

	public static void main(String[] args) {

		System.out.println(solution("happy", 3));
	}

}
