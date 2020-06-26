package quiz34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MenuManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//맵이용 하는데 key : 메뉴이름 	value : 가격
		Map<String,Integer> map = new HashMap<>();
		while(true) {
			System.out.println("-----음식 메뉴 관리-----");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인후에 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경메뉴 입력받아 포함되어있다면 가격수정
			System.out.println("4. 메뉴판 삭제"); //변경메뉴 받아 있으면 삭제
			System.out.println("5. 종료");
			System.out.print("메뉴입력>");
			int menu = sc.nextInt();

			switch(menu) {
			case 1:
				System.out.print("메뉴 입력 :");
				String food = sc.next();

				if(map.containsKey(food)) {
					System.out.println("이미 등록된 음식입니다.");
					break;
				}
				System.out.print("가격 입력 :");

				int price = sc.nextInt();
				map.put(food,price);
				System.out.println(map.toString());
				break;

			case 2:
				Set<Entry<String, Integer>> set =map.entrySet(); // 일자로 정렬
				Iterator<Entry<String, Integer>> iter =set.iterator();	// 반복자 생성

				while(iter.hasNext()) { // 다음확인
					String key = iter.next().getKey();
					System.out.println("메뉴 : " + key+ " 가격 : "+ map.get(key));

				}

				break;
			case 3:
				System.out.print("수정할 메뉴를 입력하세요 :");
				food = sc.next();
				if(map.containsKey(food)) {

					System.out.print("가격을 입력하세요 :");
					int p = sc.nextInt();
					System.out.println(map.get(food)+"원->"+p+"원");
					map.put(food,p);
					break;
				}
				System.out.println("메뉴가 존재하지않습니다.");

				break;
			case 4:
				System.out.print("삭제할 메뉴를 입력하세요 :");
				food = sc.next();
				if(map.containsKey(food)) {
					map.remove(food);
					System.out.println(food+"가 삭제됐습니다");
					break;
				}
				System.out.println("메뉴가 존재하지않습니다.");

				break;
			case 5:
				System.out.println("종료합니다");
				sc.close();
				System.exit(0);
				break;



			}

		}

	}

}
