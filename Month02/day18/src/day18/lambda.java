package day18;
interface bike{
	void drive(int dis);
}
public class lambda {

	public static void main(String[] args) {
		bike b1=(d)->{System.out.println(d+"M 만큼 이동했음");};
	
	b1.drive(4);
	}

}
