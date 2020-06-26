package quiz;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("구입할 메뉴는?\n[수박,사과,멜론,포도,귤] \n>>");
		String ff = sc.next();
		

		switch(ff) {
		case "수박":
			System.out.println(ff+"의 가격은 2만원입니다.");
			break;
		case "사과":

			System.out.println(ff+"의 가격은 3만원입니다.");
			break;
		case "멜론":

			System.out.println(ff+"의 가격은 4만원입니다.");
			break;
		case "포도":

			System.out.println(ff+"의 가격은 5만원입니다.");
			break;
		case "귤":

			System.out.println(ff+"의 가격은 6만원입니다.");
			break;
		default:
			System.out.println(ff + "는 메뉴에 없습니다.");
			System.out.println("다시 입력해 주세요.");

		}

	}

}
