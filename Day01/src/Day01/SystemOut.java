package Day01;

public class SystemOut {

	public static void main(String[] args) {
		// main 이라고 적고 ctrl + space를 누르면 실행 함수가 자동 생성
		/*
		 코드실행 단축키 ctrl + f11

		 */
		System.out.println("안녕하세요");
		System.out.println("반가워요");
		
		
		//개행이 없는 print()
		System.out.println("줄바꿈이 없음 ");

		//형식지정 출력문 printf()
		/*
		 *  \n 줄바꿈
		 *  \t tab정렬
		 *  %d 정수를 입력받음
		 *  %s 문자열 입력받음
		 *  %f 실수값 입력받음
		 *  실수 서식 문자에서 %.xf형식 소수점의 자리수를 표현한다.
		 *  정렬 : ctrl +a, ctrl + i
		 *  코드를 옮길때 : alt + 방향키
		 *  이름 동시에 바꾸기 : alt + shift + r
		 */		
		System.out.printf("안녕하세요 제 이름은 %s이고, 오늘날짜는 %d월 %d일 입니다 \n","홍길동",3,23);
		System.out.printf("파이 값은 %.2f\n",3.14);

		System.out.printf("%dx%d=%d\t %dx%d=%d\n",4,4,16,4,8,32);
	}

}
