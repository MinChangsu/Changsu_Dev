package day18;
import java.util.*;

class strcom implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
	
}



public class Test {

	public static void main(String[] args) {
		List<String> sli=new ArrayList<String>();
	sli.add("Bananaa");	
	sli.add("Carrot");	
	sli.add("Apple");
	Collections.sort(sli,new strcom());
	
	int inx =Collections.binarySearch(sli, "Apple",new strcom());
	System.out.println(inx);
	}

}
