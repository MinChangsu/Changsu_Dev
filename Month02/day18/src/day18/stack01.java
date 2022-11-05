package day18;
import java.util.*;
public class stack01 {

	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<>();
		deq.offerFirst("1.box");
		deq.offerFirst("2.toy");
		deq.offerFirst("3.robot");
		for(String a:deq) {
			System.out.println(a);
		}
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
	}

}
