package quiz28;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. 주민번호 13자리를 입력받습니다.
		 * 2. 주민번호는 - 포함해서 받을 수 있습니다.
		 * 3. 13자리가 아니면 다시 입력 받으세요 
		 * 4. 13자리라면 남자 여자인지 구분후 출력
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("주민번호 입력하세여");
			String ip = sc.nextLine();
			if(ip.length()==14) {
				String a = ip.substring(7,8);
				String b = ip.substring(6,7);
				if(!b.equals("-")) {
					System.out.println("다시입력");
		
				}else if(a.equals("1")) {
					System.out.println("남자");
					break;
				}else if(a.equals("2")) {
					System.out.println("여자");
					break;
				}
			}else {
				System.out.println("다시입력하세요");
			}
		}
		sc.close();
	}
}



