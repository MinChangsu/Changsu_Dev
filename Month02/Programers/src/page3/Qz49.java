package page3;
//약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
//자연수 n이 매개변수로 주어질 때 n이하의 합성수의 
//개수를 return하도록 solution 함수를 완성해주세요.

public class Qz49 {
	public static boolean hap(int n) {
		int i=0;
		for(int k=1;k<=n;k++) {
		if(n%k==0) {i++;}}
		if(i>=3)return true;
		else return false;
	}
	public int solution(int n) {
        int answer = 0;
        for(int num=1;num<=n;num++)
        	if(hap(num))
        		answer++;
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
