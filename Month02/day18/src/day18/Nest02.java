package day18;
interface Player{
	void training();
}

public class Nest02 {

	public static void main(String[] args) {
		Player son =new Player() {
			public void training() {
				System.out.println("드리블연습");}};
			son.training();
		Player park =new Player() {
			public void training() {
				System.out.println("변화구연마");}};
			park.training();
			
	
	}

}
