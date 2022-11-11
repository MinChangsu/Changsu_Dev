package page3;
//정수 n이 매개변수로 주어질 때, n의 약수를 
//오름차순으로 담은 배열을 return하도록 
//solution 함수를 완성해주세요.

import java.util.stream.*;
public class Qz36 {
	public int[] solution(int n) {
        
        return IntStream.range(1, n+1).filter(i->n%i==0).toArray();
    }
	public static void main(String[] args) {

	}

}
