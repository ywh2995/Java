package day02;

public class OperatorEx03 {
	public static void main(String[] args) {
		int x=10,y=20;
		
		//if 뒤에 ()가 참이면 if {} 실행 , 거짓이면 else{}실행
		if( x != 10 & ++y == 21) { // 두개짜리 연산자는 논리연산자기 만족할 수 없는 조건일때 뒤를 실행하지않음
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
		System.out.println(x);
		System.out.println(y);
		
		if(x ==10 | ++y == 21) {
			System.out.println("참입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
		System.out.println(x);
		
		System.out.println(y);
		
	}
}
