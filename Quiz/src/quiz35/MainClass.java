package quiz35;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 1. List,set,map 이용해서 간단한 관리 프로그램 
		 * 	  (도서관리, 회원관리, 예약관리,  등)
		 * 2. interface 반드시 하나 사용
		 * 3. 기능은 3개 이상 
		 * 4. 클래스 사용
		 */
		Map<String,String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Inter p = new Pin();
		while(true) {

			System.out.println("-----------회원관리----------");
			System.out.println("1.회원 등록");
			System.out.println("2.회원 검색 ");
			System.out.println("3.회원 정보 수정");
			System.out.println("4.회원 정보 삭제");
			System.out.println("5.종료");
			System.out.print("메뉴입력 >>");
			int menu = sc.nextInt();

			switch(menu) {
			case 1:
				p.input(map);
				break;
			case 2:
				p.search(map);
				break;
			case 3:
				p.set(map);
				break;
			case 4:
				p.delete(map);
				break;
			case 5:
				System.out.println("시스템 종료합니다");
				System.exit(0);
			}
		}

	}
}
