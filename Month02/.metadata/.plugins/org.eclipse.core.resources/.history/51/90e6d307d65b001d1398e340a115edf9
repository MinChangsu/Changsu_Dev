package day17;
class Fruit{}
class Peach extends Fruit{}
class Grape extends Fruit{}
class Bucket<T>{
	private T ob;
	void set(T o) {this.ob=ob;}
	T get() {return this.ob; }}
class Buckethand{
	static void outbox(Bucket<? extends Fruit> bucket){
		Object ob=bucket.get();
		
	}
	static void inbox(Bucket<? super Fruit>bucket){
		bucket.set(new Fruit());
		
	}
}

public class Ge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
