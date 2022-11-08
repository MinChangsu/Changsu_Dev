package page2;
//정수 n이 매개변수로 주어질 때
//n의 각 자리 숫자의 합을 return하도록
//solution 함수를 완성해주세요

public class Qz25 {
	 public int solution(int n) {
	        int answer = 0;
	        String st=String.valueOf(n);
	        for(int i=0;i<st.length();i++) {
	        answer+=(Integer.valueOf(String.valueOf(st.charAt(i)))).intValue();
	        }
	        return answer;
	    }
	public static void main(String[] args) {

	}

}
