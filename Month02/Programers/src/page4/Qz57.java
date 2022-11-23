package page4;
//문자열 s가 매개변수로 주어집니다. s에서 
//한 번만 등장하는 문자를 사전 순으로 정렬한
//문자열을 return 하도록 solution 함수를 
//완성해보세요. 한 번만 등장하는 문자가 없을 경우
//빈 문자열을 return 합니다.
import java.util.*;
public class Qz57 {
    public static String solution(String s) {
        String answer = "";
        List<String> a= Arrays.stream(s.split("")).distinct().toList();
       List<String>b=new ArrayList<>();
       String[] c=s.split("");
       for(String i:a) {
    	   int cnt=0;
    	   for(String m:c){
    		   if(i.equals(m)) {
    			   cnt++;
    			  } }
    	   if(cnt==1)
    		   b.add(i);}       
       Collections.sort(b);       
       for(String i:b)
    	   answer+=i;
       System.out.println(answer);
        return answer;
    }
	public static void main(String[] args) {
	
		 solution("abdc");

	}

}
