package overloading.basic;

public class Basic {
	/*
	 * 오버로딩  - 같은 이름의 메서드를 여러개 생성하는것
	 * 
	 * 규칙 :
	 * 1. 이름이 같아야홤
	 * 2. 반환유형은 오버로딩 영향에 미치지않음
	 * 3. 매개변수 타입이 달라야함
	 * 4. 매개변수 종류가 달라야함
	 * 4. 매개변수 순서가 달라야함
	 * 즉 -> 완전히 동일하지 않으면 됨
	 * 
	 */
	
	void input(int a) {
		System.out.println("정수 1개가 입력됨");
	}
	
//	int input(int a) {
//		return 0;		
//	}
	
	void input(String s) {
		System.out.println("문자열 1개가 입력됨");
	}
	void input(int a,double b) {
		System.out.println("정수 1개 , 실수 1개 입력됨");
	}
	void input(double b,int a) {
		System.out.println("정수 1개 , 실수 1개 입력됨");
	}
	void input (String a, String b) {
		System.out.println("문자열 2개");
	}
	void input (char a, int b, double c) {
		System.out.println("문자 1개 정수 1개 실수 1개");
	}
}
