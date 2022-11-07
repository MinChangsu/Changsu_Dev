package page1;
//머쓱이는 추운 날에도 아이스 아메리카노만 마십니다.
//아이스 아메리카노는 한잔에 5,500원입니다. 머쓱이가
//가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가
//최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로
//담은 배열을 return 하도록 solution 함수를 완성해보세요.
public class Qz05 {
	public int[] solution(double money) {
        int coffee= (int)(money/5500.0);
       int m=(int)money-coffee*5500;
       int[] answer = {coffee,m};
        return answer;
    }
	public static void main(String[] args) {


	}

}
