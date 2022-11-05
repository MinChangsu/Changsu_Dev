package day17;
import java.util.*;

class Student{
	int age;
	Student(int a){
		age=a;
	
	}
	@Override
	public boolean equals(Object obj) {
		if(this.age==((Student)obj).age)return true;
		else return false;}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age;
	}
	
	
}

public class Hashset01 {

	public static void main(String[] args) {
		Set<Student>sset=new HashSet<>();
		sset.add(new Student(12));
		sset.add(new Student(12));
		sset.add(new Student(15));
		sset.add(new Student(15));
		for(Student s:sset) {
			System.out.println(s.age);
		}

	}

}
