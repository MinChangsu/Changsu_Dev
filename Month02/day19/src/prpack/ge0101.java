package prpack;
import java.util.*;
interface Eatable{}
class Fruit implements Eatable{
	public String toString() {return "Fruit";}
}
class Apple extends Fruit{}
class Orange extends Fruit{}
class Toy{}


class FruitBox<T extends Fruit> extends Box<T>{
	
}

class Box<T>{
	ArrayList<T> list=new ArrayList<>();
	void add(T item) {list.add(item);}
	T get(int i) {return  list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString(); }
}
public class ge0101 {

	public static void main(String[] args) {
	FruitBox<Fruit> fb=new FruitBox<>();
	FruitBox<Apple> ab=new FruitBox<>();
	FruitBox<Orange> bb=new FruitBox<>();
	Box<Toy> tb = new Box<>();
	

	}

}
