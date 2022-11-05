package day19;
import java.util.*;

class Strcmp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
	
}
public class Rambda01 {

	public static void main(String[] args) {
		List<String>li =new ArrayList<>();
		li.add("Robot");
		li.add("Lambda");
		li.add("Box");
		
		Collections.sort(li,new Strcmp());
		Collections.sort(li,(String o1,String o2)->{return o1.length()-o1.length();});
		
		System.out.println(li);

	}

}
