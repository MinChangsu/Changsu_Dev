package day20;
import java.util.*;
class ToyPriceinfo{
	private String model;
	private int price;
	
	public ToyPriceinfo(String s,int n) {
		model=s;price=n;
	}
	public int getPrice() {
		return this.price;
	}
}
public class Mapping03 {

	public static void main(String[] args) {
		List<ToyPriceinfo>ls=new ArrayList<>();
		ls.add(new ToyPriceinfo("a",200));
		ls.add(new ToyPriceinfo("b",300));
		ls.add(new ToyPriceinfo("c",550));
		int sum=ls.stream()
				.filter(p->p.getPrice()<500)
				.mapToInt(p->p.getPrice())
				.sum();
		System.out.println(sum);
		
	}

}
