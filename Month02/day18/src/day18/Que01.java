package day18;
import java.util.*;
public class Que01 {

	public static void main(String[] args) {
		Queue<String> que =new LinkedList<>();
		que.offer("박스");
		que.offer("토이");
		que.offer("로봇");
		
		System.out.println("next"+que.peek());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println("next"+que.peek());
		System.out.println(que.poll());

	}

}
