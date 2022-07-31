package built_in.time;

import java.time.LocalTime;

public class LocalTimeEX {

	public static void main(String[] args) {
		LocalTime now =LocalTime.now();
		System.out.println(now.getSecond());
		System.out.println(now.toNanoOfDay());
		System.out.println(now.toSecondOfDay()+10);
		System.out.println(now.toString());
		System.out.println(now.MAX);
		System.out.println(now.MIN);
		System.out.println(now.MIDNIGHT);
		System.out.println(now.NOON);
		System.out.println(now.plusHours(1L));
		System.out.println(now.plusMinutes(10L));
		System.out.println(now.plusSeconds(100L));
		System.out.println(now.plusNanos(100000L));
		System.out.println(now.minusHours(2L));

	}

}
