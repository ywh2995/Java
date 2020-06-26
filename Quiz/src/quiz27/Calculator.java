package quiz27;

import java.util.Scanner;

public class Calculator {
	public int input() throws Exception{
		/*
		 * 1. 정수2개 받는다
		 * 2. 입력값이 정수라면 합계 반환
		 * 3. 예외 발생 할 수 있는 상황이라면 메서드를 종료하고 예외 메시지를 전달.
		 * 4. scan.close() 적절하게 처리해 주세요.
		 */
		Scanner sc = new Scanner(System.in);
	try {
		System.out.print("정수입력 : ");
		int n1 = sc.nextInt();
		System.out.print("정수입력 : ");
		int n2 = sc.nextInt();		
		
		return n1+n2;
		
	} catch (Exception e) {
		throw new Exception("숫자값을 입력하세요");
	} finally {
		sc.close();
	}
		
}
	
}
