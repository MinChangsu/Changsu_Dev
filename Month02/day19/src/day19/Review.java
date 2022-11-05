package day19;
interface Printable{
	void print(String s);
}
public class Review {

	public static void main(String[] args) {
		Printable p = (s) -> {System.out.println(s);};
		
		p.print("fdfdf");
	} 

}
