package day17;
import java.util.*;
public class qz02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		boolean jd=false;
		int n1=rn.nextInt(1,3);
		for(int i=10;i>0;i--) {
			System.out.println("숫자입력");
			int num=sc.nextInt();
			if(num==n1) {
				System.out.println("정답 ㅊㅊ");
				jd=true;
				break;}
			else {
				System.out.printf("틀림 기회%d번남음\n",i);
			}
}
		if(jd==false) {
			System.out.println("기회끝ㅠㅠ");
		}
		sc.close();
	}

}
