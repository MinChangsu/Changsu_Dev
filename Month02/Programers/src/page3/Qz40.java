package page3;
//영어 대소문자로 이루어진 문자열
//my_string이 매개변수로 주어질 
//때, my_string을 모두 소문자로 
//바꾸고 알파벳 순서대로 정렬한 문자열을 
//return 하도록 solution 함수를 완성해보세요.
import java.util.*;
public class Qz40 {
	public static String solution(String my_string) {
String[] myst=my_string.split("");

Object[] myst1=Arrays.stream(myst).map(s->s.toLowerCase()).sorted().toArray();
	String answer ="";
	for(Object s:myst1) {
		answer+=s.toString();}
	return answer;
    }
	public static void main(String[] args) {

		System.out.println(solution("Henf"));
	}

}
