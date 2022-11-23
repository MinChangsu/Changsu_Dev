package page4;

import java.util.Arrays;

//머쓱이는 행운의 숫자 7을 가장 좋아합니다.
//정수 배열 array가 매개변수로 주어질 때, 
//7이 총 몇 개 있는지 return 하도록 solution 
//함수를 완성해보세요.

public class Qz55 {
	public int solution(int[] array) {
        int answer = 0;
        for(String s:Arrays.toString(array).split("")) {
        	if(s.equals("7"))
        		answer++;
        }
        return answer;
    }
	public static void main(String[] args) {
		

	}

}
