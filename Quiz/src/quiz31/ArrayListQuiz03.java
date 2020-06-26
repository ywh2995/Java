package quiz31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<User> list  = new ArrayList<>();

		while(true) {
			System.out.println("[1.등록 | 2.회원정보보기 | 3.회원정보검색 | 4.회원정보삭제 | 5.종료");
			System.out.print("메뉴입력 >>");
			int menu = sc.nextInt();


			if(menu==1) {
				// scanner로 이름나이 입력받고 user 에 저장, 리스트 추가
				System.out.println("이름과 나이를 입력하세요");
				String name = sc.next();
				int age = sc.nextInt();

				list.add(new User(name,age));


			}else if(menu ==2) {
				// list길이 만큼 회전 하면서 user 객체의 이름, 나이를 순서대로 출력
				for(int i=0;i<list.size();i++) {
					System.out.print(list.get(i).getName()+" ");
					System.out.println(list.get(i).getAge());
				}

			}else if(menu ==3) {
				// 찾을 이름을 입력받습니다. 이름이 있다면 이름과 나이를 출력
				// 이름이 없으면 ~~님은 목록에 없습니다. 출력
				System.out.print("찾을 이름을 입력하세요 :");
				String name = sc.next();
				boolean b =false;
				for(int i =0; i<list.size();i++) {
					if(list.get(i).getName().equals(name)) {
						System.out.println(list.get(i).getName());
						System.out.println(list.get(i).getAge());
						b = true;
						break;
					}
				}
				if(b == false) {
					System.out.println(name+"님이 없습니다.");
				}


			}else if(menu ==4) {
				// 삭제할 이름을 입력받습니다. 입력받은 이름과 동일하면 유저객체를 삭제
				System.out.print("삭제할 이름을 입력하세요 :");
				String name = sc.next();
				boolean b = false;
				for(int i =0; i<list.size();i++) {
					if(list.get(i).getName().equals(name)) {
						list.remove(i);
						b =true;
						break;
					}
				}
				if(b==false) {
					System.out.println(name+"님이 없습니다.");
				}

			}else if(menu ==5) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("다시 입력 하세요");
			}



		}

	}

}
