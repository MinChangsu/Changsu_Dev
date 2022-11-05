package day17;
interface Eatable {public String eat();}
class Apple implements Eatable{
	public String eat() {
		return "good";
	}
}
class Box5 <T extends Eatable>{
	T ob;
	public void set(T o) {ob=o;}
	public T get() {
		System.out.println(ob.eat());
		return ob;
	}
}
public class Generic07 {

	public static void main(String[] args) {
	Box5<Apple> b1= new Box5<Apple>();
	Apple a1=new Apple();
	b1.set(a1);
	System.out.println(b1.get());
	
	}

}
