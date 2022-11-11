package page3;
//정수 배열 num_list와 정수 n이 매개변수로 주어집니다. 
//num_list를 다음 설명과 같이 2차원 배열로 바꿔 
//return하도록 solution 함수를 완성해주세요.
//num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 
//로 길이가 8이고 n이 2이므로 num_list를 2 * 4 
//배열로 다음과 같이 변경합니다. 2차원으로 바꿀 때에는 
//num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.

public class Qz51 {
	public int[][] solution(int[] num_list, int n) {
		int num1=num_list.length/n;
		int args=0;
        int[][] answer = new int[num1][n];
        for(int i=0;i<num1;i++) {
        	for(int k=0;k<n;k++) {
        		answer[i][k]=num_list[args++];
        	}
        }
        return answer;
    }
	public static void main(String[] args) {


	}

}
