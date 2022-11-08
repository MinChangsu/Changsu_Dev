package page3;
//정수 n과 정수 배열 numlist가 매개변수로 
//주어질 때, numlist에서 n의 배수가 아닌 
//수들을 제거한 배열을 return하도록 solution
//함수를 완성해주세요.
import java.util.*;
public class Qz34 {
	public int[] solution(int n, int[] numlist) {
      return Arrays.stream(numlist).filter(i->i%n==0).toArray();
    }
	public static void main(String[] args) {

	}

}
