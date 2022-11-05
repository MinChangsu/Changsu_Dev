
public class forQz {

	public static void main(String[] args) {
		for(int i=2;i<9;i+=2) {
			System.out.printf("=====%d단======\n",i);
			for(int k=1;k<=9;k++) {
				if(i<k) continue;
				else
				System.out.printf("%d x %d = %d\n",i,k,i*k);
			}
		}

	}

}
