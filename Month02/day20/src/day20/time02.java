package day20;
import java.util.*;
import java.time.*;
public class time02 {

	public static void main(String[] args) {
		LocalTime now =LocalTime.now();
		LocalTime end=LocalTime.of(17, 50, 0);
		Duration bet=Duration.between(now, end);
		System.out.println("남은시간은 "+bet.toHoursPart()+"시간"+bet.toMinutesPart()+"분");

	}

}
