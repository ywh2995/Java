package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// 날짜 클래스
		Date date =new Date();
		System.out.println(date.toString());
		// 날짜 포맷 클래스
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//		sdf.format(date);
//		
		SimpleDateFormat now = new SimpleDateFormat("yyyyMMdd");
		
		System.out.println(now.format(date));
		
		
		
		
	}

}
