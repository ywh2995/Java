package quiz24;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		IBag ar = new Array();

		while(true) {
			System.out.println("1번 입력");
			System.out.println("2번 검색");
			System.out.println("3번 삭제");
			System.out.println("4번 출력");
			System.out.print(">>");
			int a = sc.nextInt();

			switch(a) {
			case 1: 
				System.out.print("아이템 입력 :");
				String item = sc.next();
				ar.insert(item);
				
				break;

			case 2:
				System.out.print("검색 아이템 입력 :");
				String sea = sc.next();
				System.out.println(sea+"는 "+ar.search(sea)+"번째 배열에 있습니다.");
				if(ar.search(sea)==-1) {
					System.out.println("검색실패");
				}
				break;

			case 3:
				System.out.print("삭제아이템 입력:");
				String del = sc.next();
				System.out.println(del+"를 삭제합니다.");
				boolean bool =ar.delete(del);
				if(bool == true) {
					System.out.println(del+"삭제성공");
					
				}else {
					System.out.println("삭제실패");
				}
				break;
			
			case 4:
				System.out.println("아이템 개수 출력");
				ar.print();
			
			}
		}
	}
}
