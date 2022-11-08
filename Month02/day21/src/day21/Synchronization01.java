package day21;
class Counter{
	int count=0;
	 public void incre() {synchronized(this) {count++;}}
	 public void decre() {synchronized(this){count--;}}
	public int getcnt() {return count;}
}
public class Synchronization01 {
 static Counter myCnt =new Counter();
	public static void main(String[] args) throws InterruptedException{
		Runnable task1=()->{
			for(int i=0;i<100000;i++)
				myCnt.incre();
		};
		Runnable task2=()->{
			for(int i=0;i<100000;i++)
				myCnt.decre();
		};
		Thread t1 =new Thread(task1);
		Thread t2 =new Thread(task2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(myCnt.getcnt());

	}

}
