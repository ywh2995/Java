package day02;

public class VariableEx {

	public static void main(String[] args) {
		
		/*
		 1. 변수선언 방법
		 - 데이터타입 + 이름;
		 - int는 정수값을 저장하는 대표적 유형
		 - String은 문자열을 저장하는 대표적 유형
		 */

		int num;
		// 초기화
		num = 10;
		System.out.println(num);
	
		// 변수의 선언과 초기화 동시에
		int num2 = 20;
		
		// 같은 이름으로 변수를 생성할 수 없음
//		int num = 100;
		
		// 변수는 다른 변수의 값, 또는 연산의 결과도 저장할 수 있습니다.
		int result = num + num2;
		
		// 문자열 저장
		String str = "안녕";
		
	}

}
