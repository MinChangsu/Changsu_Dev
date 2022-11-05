package day17;
//interface 어떤 객체를 만들고 싶은지 혹은 만들어야 하는지에 대한 약속

interface Cat{
	String species ="고양이과";
	void eating();
	void sleeping();
	default void attacking(){}
}

interface  Tiger extends Cat{
	void hunting();
}

class Puma implements Cat{
	String name =species +"퓨마";
public void eating(){}
public void sleeping(){}
public void hiding(){}


}
public class Review {

	public static void main(String[] args) {
		Cat c =new Puma();
		c.eating();
		c.attacking();
		//c.hiding();
		
	}

}
