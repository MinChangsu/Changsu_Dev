package animal;

public class Bear {

	public String name;
	int age;
	private String color;
	

	public void setage(int n) {
		this.age=n;
	}
	public void myname() {
		System.out.println("내 이름은"+name);
	}
	public void myage() {
		System.out.println("내 나이는 "+age);
	}
	private void mycolor() {
		System.out.println("내 색깔은 "+color);
	}
	public void setcolor(String c) {
		this.color=c;
	}
	public void intro() {
		System.out.printf("%s의 나이는%d 이고 색깔은 %s이다 ",name,age,color);
	}
}
