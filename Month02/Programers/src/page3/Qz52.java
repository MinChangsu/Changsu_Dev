package page3;
//문자열 before와 after가 매개변수로 주어질 때,
//before의 순서를 바꾸어 after를 만들 수 있으면 1을,
//만들 수 없으면 0을 return 하도록 solution 함수를 
//완성해보세요
import java.util.*;
public class Qz52 {
	public static int solution(String before, String after) {
		String[] b = before.split("");
		String[] a = after.split("");
		Arrays.sort(b);
		Arrays.sort(a);
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(b[i].equals(a[i]))
				c++;}
		if(c==a.length)
		return 1;
		else
			return 0;
		
	}
        
	public static void main(String[] args) {

System.out.println(solution("olleh", "hello"));
	}

}
