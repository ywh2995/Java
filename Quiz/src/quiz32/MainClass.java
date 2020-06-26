package quiz32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		InterPoint p = new Point();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			InterPoint.menuInfo();
			
			System.out.print("메뉴입력 >>");
			String menu = sc.next();
			Student std = new Student();
			
			switch(menu) {
			case "1":
			p.input(list);
				break;
				
			case "2":
			p.showAll(list);
				break;
			case "3":
			p.search(list);
			
				break;
			case "4":
			p.modify(list);
				break;
			case "5":
			p.delete(list);
				break;
			case "6":
			System.out.println("종료합니다.");
				break;
			default:
				System.out.println("메뉴 잘못입력했습니다.");
				break;
			}
					
		}
		
	}

}
