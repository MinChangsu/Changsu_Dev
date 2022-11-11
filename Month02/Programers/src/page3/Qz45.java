package page3;


import java.util.stream.Collectors;

import java.util.*;

//정수가 담긴 배열 numbers와 문자열 direction가
//매개변수로 주어집니다. 배열 numbers의 원소를 
//direction방향으로 한 칸씩 회전시킨 배열을 
//return하도록 solution 함수를 완성해주세요.

public class Qz45 {
	public static int[] solution(int[] numbers, String direction) {
       List<Integer> ab=Arrays.stream(numbers).boxed().collect(Collectors.toList());
       if(direction.equals("right")){
    	  Integer x= ab.get(ab.size()-1);
    	  ab.remove(x);
    	  ab.add(0, x);}
       else {
       Integer x= ab.get(0);
 	  ab.remove(x);
 	  ab.add(ab.size(), x);}
       int[] answer =ab.stream().mapToInt(i->i.intValue()).toArray();
        return answer;
    }
	public static void main(String[] args) {
		int[] nn= {1,2,3};
		solution(nn, "righ");

	}

}
