package ss;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		InterPoint p = new Pin();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			InterPoint.menuInfo();
			System.out.print("메뉴입력 >");
			int m = sc.nextInt();
			
			switch(m) {
			case 1 :
				p.input(list);
				break;
			case 2 :
				p.showAll(list);
				break;
			case 3 :
				p.search(list);
				break;
			case 4 :
				p.findpw(list);
				break;
			case 5:
				System.out.println("종료합니다.");
				System.exit(0);
			}
			
			
			
		}
		
	}

}
