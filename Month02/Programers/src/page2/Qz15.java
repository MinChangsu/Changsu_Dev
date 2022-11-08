package page2;
//정수 n이 매개변수로 주어질 때, n 이하의 홀수가
//오름차순으로 담긴 배열을 return하도록 solution 
//함수를 완성해주세요.
import java.util.*;
import java.util.stream.*;

public class Qz15 {
//	 public int[] solution(int n) {
//	List<Integer>li=new ArrayList<>();
//	        for(int i=n;i>0;i--) {
//	        	if(i%2==1)
//	        		li.add(i);}
//	      Collections.sort(li);
//	        int[]answer=li.stream().mapToInt(i->i).toArray();
//	        return answer;
//	    }
	 public int[] solution(int n) {
	        
	    return IntStream.rangeClosed(0, n).filter(i->i%2==1).toArray();
	    }
	public static void main(String[] args) {


	}

}
