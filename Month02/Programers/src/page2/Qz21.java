package page2;
//두 배열이 얼마나 유사한지 확인해보려고 합니다.
//문자열 배열 s1과 s2가 주어질 때 같은 원소의 
//개수를 return하도록 solution 함수를 완성해주세요.
import java.util.*;
public class Qz21 {
	 public int solution(String[] s1, String[] s2) {
	        int answer = 0;
	       for(String s:s1) {
	    	   if(Arrays.asList(s2).contains(s))
	    		   answer++; }
	        return answer;
	    }
	public static void main(String[] args) {

	}

}
