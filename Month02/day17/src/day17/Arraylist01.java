package day17;
import java.util.*;
public class Arraylist01 {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Box");
		list.add("Robot");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	itr=list.iterator();
	String str;
	while(itr.hasNext()) {
		str=itr.next();
		if(str.equals("Box"))
			itr.remove();
	}
	
	
	}

}
