package day20;
import java.time.*;
import java.util.*;
public class Instant01 {

	public static void main(String[] args) {
		Instant start =Instant.now();
		long a =start.getEpochSecond();
//		System.out.println("시간간격을 만들기위한 출력문");
//		System.out.println("시간간격을 만들기위한 출력문");
//		System.out.println("시간간격을 만들기위한 출력문");
//		System.out.println("시간간격을 만들기위한 출력문");
		Instant end =Instant.now();
		long b =end.getEpochSecond();
		Duration between = Duration.between(start, end);
		//System.out.println(b-a);
		//System.out.println(between.toMillisPart());
		
		LocalDate today=LocalDate.now();
		LocalDate nottoday=LocalDate.of(2023, 12, 25);
		System.out.println(today);
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.getMonth());
		Period p=Period.between(today, nottoday);
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		
	}

}
