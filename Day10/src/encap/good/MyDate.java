package encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;

	/*
	 * 은닉된 변수에 접근 할 때는 클래스 설계자가 미리 생성해 놓은
	 * getter(),setter()메소드 사용 해서 데이터 접근합니다.
	 * 
	 * setter()메서드 선언
	 * 1. 은닉 변수에 값을 저장하기 위한 메서드
	 * 2. 접근제한자 public 으로 선언하고 이름은 set + 멤버 변수이름으로 저장
	 */

	public void setYear(int year) {
		if(year < 1 || year>2020) {
			System.out.println("잘못된 값 입력");
		}else {
			this.year = year;
		}
	}
	/*
	 * getter메서드 선언
	 * 1. 은닉변수에 값을 조회하는 메서드
	 * 2. 접근제한자는 public선언하고 이름은 get + 멤버변수 이름으로 지정
	 */

	public int getYear() {
		return year;
	}
	/*
	 * 1.month day ssn에 getter setter
	 * month 1 ~ 12
	 * day 1~31
	 * ssn - 13자리 .length()
	 * 
	 */

	public void setMonth(int month) {
		if(month<1 || month>12) {
			System.out.println("잘못된값입니다.");

		}else {
			this.month=month;
		}
	}
	
	
	public int getMonth() {
		return month;
	}


	
	
	
	public void setDay(int day) {
		if(day<0 || month>31) {
			System.out.println("잘못된값입니다.");

		}else {
			this.day=day;
		}
	}


	public int getDay() {
		return day;
	}



	
	
	public void setSsn(String ssn) {
		if(ssn.length()>13) {
			System.out.println("값을 초과하였습니다.");
			return;
		}else {
			this.ssn = ssn;
		}
	}


	public String getSsn() {
		return ssn;
	}


























}
