package built_in.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		LocalDateTime todayNow = LocalDateTime.now();
		System.out.println(todayNow);

		System.out.println(todayNow.getHour());
		System.out.println(todayNow.getMinute());
		System.out.println(todayNow.getSecond());
		System.out.println(todayNow.getNano());
		// LocalDateTime은 LocalDate와 LocalTime을 모두 포함하는 구조입니다

		String curr = todayNow.toString();
		System.out.println(curr);
		System.out.println(curr.substring(0,curr.indexOf("T")));
		System.out.println(curr.substring(curr.indexOf("T")+1));
		System.out.println(curr.substring(0,curr.indexOf(".")));
		System.out.println(curr.replace("T"," ").substring(0,curr.lastIndexOf(".")));
		
		//자주 사용하지는 않지만 원하는 형태로 만들 수 있는 방법
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd hh.mm.ss");
		System.out.println(dtf.format(todayNow));
		
	}

}
