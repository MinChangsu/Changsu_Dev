package page1;
//문자열 my_string이 매개변수로 주어집니다.
//my_string을 거꾸로 뒤집은 문자열을 
//return하도록 solution 함수를 완성해주세요.

public class Qz08 {
	public static String solution(String my_string) {
       int len= my_string.length();
       char[]c =new char[len];
        for(int i=0;i<len;i++) {
        	c[len-i-1]=my_string.charAt(i);}
       String answer=new String(c);
        
       System.out.println(c);
        return answer;
    }
	public static void main(String[] args) {
		solution("happy");

	}

}
