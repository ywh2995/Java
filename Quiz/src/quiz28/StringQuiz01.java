package quiz28;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 스캐너 통해 아이디 입력받기
		 * 아이디는 공백을 포함해서 받을 수 있고 
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받으세여.
		 * 5글자 이상이면 id가 등록되었습니다. 출력 후 종료
		 * 
		 */
		Scanner sc  = new Scanner(System.in);
		while(true) {
		System.out.println("아이디를 입력하세여");
		String id = sc.nextLine();
		id = id.replace(" ","");
			if(id.length()>=5) {
				System.out.println("id등록 완료");
				break;
		}else {
			System.out.println("다시입력해주세여");
		}
		
		
		
		}
		
		

	}

}
