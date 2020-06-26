package quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요: ");
		int p = sc.nextInt();


		switch (p/10) {

		case 9:
			if(p >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점입니다.");
			}
			break;

		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		case 6:
			System.out.println("D학점입니다.");
			break;
		default:
			if(p==100) {
				System.out.println("A+학점입니다.");
			}else if(p>100) {
				System.out.println("잘못입력하셨습니다.");
			}else {
				System.out.println("F학점입니다.");		
			}			
			break;
		}
	}
}

