package page4;
//정수 배열 array와 정수 n이 매개변수로
//주어질 때, array에 들어있는 정수 중 n과 
//가장 가까운 수를 return 하도록 solution
//함수를 완성해주세요.
import java.util.*;
public class Qz56 {
	public static int solution(int[] array, int n) {
        int index=0;
       Arrays.sort(array);
       int[] abs1=Arrays.stream(array).map(i->Math.abs(i-n)).toArray();
       int[] abs2=Arrays.stream(array).map(i->Math.abs(i-n)).toArray();
       Arrays.sort(abs2);
       for(int i=0;i<abs1.length;i++) {
    	   if(abs1[i]==abs2[0]) {
    		   index=i; break;}
       } 
        return array[index];
        
    }
	
	public static void main(String[] args) {
		int[] a= {3,10,28};
System.out.println(solution(a, 20));
		
	}

}
