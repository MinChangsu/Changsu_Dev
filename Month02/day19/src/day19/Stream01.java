package day19;
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum=0;
        for(int i:numbers)
            sum+=i;
        answer=sum/numbers.length;
        return answer;
    }
}
public class Stream01 {

	public static void main(String[] args) {
		
		
	}

}
