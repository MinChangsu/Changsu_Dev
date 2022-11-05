
public class forQz2 {

	public static void main(String[] args) {
		int n=1;
		int sum=0;
		while(true) {
			if( sum>1000)
				break;
			sum+=n;n+=2;}
		System.out.println(sum);
		System.out.println(n-2);
	}

}
