package quiz25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 1.스캐너를 통해서 정수 2개를 입력받습니다.
		 * 2.입력받은값이 정수라면 ,단순히 정수의 합을 출력하고 반복문 종료
		 * 3. 에러발생시키는 값이라면 정수로만 입력 후에 다시입력받음
		 * 4.반복문 탈출시 종료 출력
		 * 
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			try {
				System.out.println("정수 2개를 입력하세요 ");
				System.out.print(">>");
				int a = sc.nextInt();
				System.out.print(">>");
				int b = sc.nextInt();
				if(a>0 && b>0) {
					System.out.println("두정수의 합은 :"+(a+b));
					System.out.println("종료합니다.");
					break;
				}else {
					System.out.println("정수로만 입력 해주세요");
				}


			}catch(InputMismatchException e){

				System.out.println("정수로만 입력해주세요 ");
				sc.nextLine();

			}	

		}
	}


}




