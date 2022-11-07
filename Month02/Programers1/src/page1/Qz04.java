package page1;
//정수가 담긴 리스트 num_list가 주어질 때,
//num_list의 원소 중 짝수와 홀수의 개수를 담은 
//배열을 return 하도록 solution 함수를 완성해보세요.

public class Qz04 {
	public int[] solution(int[] num_list) {
        
        int evencnt=0;
        int oddcnt=0;
        for(int i:num_list) {
        	if(i%2==0)
        		evencnt++;
        	else
        		oddcnt++; }
        int[] answer = {evencnt,oddcnt};
        return answer;}
	public static void main(String[] args) {


	}

}
