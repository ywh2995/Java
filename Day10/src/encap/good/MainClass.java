package encap.good;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate me = new MyDate();
		me.setYear(2020);
		int year = me.getYear();
		System.out.println("년도 :"+year+"년");
		
		me.setMonth(10);
		int month = me.getMonth();
		System.out.println("월 :"+month+"월");
		
		me.setDay(31);
		int day = me.getDay();
		System.out.println("일 : "+day+"일");
		
		me.setSsn("970417-111111111");
		String ssn = me.getSsn();
		System.out.println("주민번호 :"+ssn);
		
		
		
		
		Member m1 = new Member("hh111","111", "홍길동", "google","서울" , 010 , 20);
		Member m2 = new Member("hh112","222", "홍길자", "naver","경기" , 010 , 21);
		
		int a=1;
		int b=2;
		
		int[] arr1 = new int[2];
		arr1[0] = a;
		arr1[1] = b;
		
		Member[] arr2= new Member[2];
		arr2[0] = m1;
		arr2[1] = m2;
		
		for(int i = 0;i<arr2.length;i++) {
			Member m  = arr2[i];
		
		System.out.println(m.getId());
		System.out.println(m.getPw());
		}
		
		
		
		
	}

}
