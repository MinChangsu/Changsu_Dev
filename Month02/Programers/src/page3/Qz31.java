package page3;
//정수 배열 array가 매개변수로 주어질 때, 
//가장 큰 수와 그 수의 인덱스를 담은 배열을 
//return 하도록 solution 함수를 완성해보세요.
import java.util.*;
public class Qz31 {
	 public int[] solution(int[] array) {
	     int[] arr =Arrays.copyOf(array, array.length);
	     int[] answer = new int[2];
		 Arrays.sort(arr);
	        answer[0]=arr[arr.length-1];
	        for(int i=0;i<array.length;i++) {
	        	if(array[i]==answer[0])
	        		{answer[1]=i;
	        		break;} }
	       return answer;
	    }
	public static void main(String[] args) {


	}

}
