package api.util.calender;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
//		Calendar cal = new Calender();
		
		Calendar cal =Calendar.getInstance(); // 달력관련 클래스 싱글톤 형식
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		System.out.println(year + "년 "+month+"월 "+date+"일" );

		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
		
			}

}
