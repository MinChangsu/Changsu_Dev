package day19;
@FunctionalInterface
interface Cat{
	String getMeow();
}



@FunctionalInterface
interface Mixcoffee{
	void drinkwater(int time);}
public class Rambda02 {

	public static void main(String[] args) {
		Mixcoffee mc = t->System.out.println(t+"모금 마시자");
		Cat c1 = ()->"야옹";
	
		mc.drinkwater(3);
		System.out.println(c1.getMeow());
	
	
	
	}}	


