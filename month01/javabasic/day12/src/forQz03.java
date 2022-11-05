
public class forQz03 {

	public static void main(String[] args) {
		int sum=0; int count=1;
		for(;;) {
			sum+=count;
			if(sum>1000) {
				System.out.println("1000을 넘어설떄의 수는 : "+ count);
				break;
			}
			count+=2;
		}
	}

}
