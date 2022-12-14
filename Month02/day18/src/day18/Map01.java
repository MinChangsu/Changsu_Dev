package day18;
import java.util.*;
class Agecompare implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
			return o1.intValue()-o2.intValue();
	}
	
}
public class Map01 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map =new TreeMap<>(new Agecompare());
		HashMap<Integer,String> map1= new HashMap<>();
		map.put(45, "brown");
		map.put(37, "james");
		map.put(23, "martin");
		
		Set<Integer>ks=map.keySet();
	
		for(Integer n:ks)
			System.out.print(n+" ");
		System.out.println();
		for(Integer n:ks)
			System.out.print(map.get(n)+" ");
		System.out.println();
		for(Iterator<Integer>itr=ks.iterator();itr.hasNext();)
			System.out.println(map.get(itr.next()));
		System.out.println(ks);
	}

}
