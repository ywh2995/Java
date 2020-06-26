package quiz25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int rd = (int) ((Math.random()*100)+1);
		while(true) {

			try {
				System.out.print("1과 100사이의 값을 입력하세요 :");
				int a = sc.nextInt();
				count ++;

				if(a==rd) {
					System.out.println("정답입니다 \n시도횟수 :"+count);
					break;

				}else if( a>rd) {
					System.out.println("더 작은수를 입력해주세요");

				}else {
					System.out.println("더 큰수를 입력해주세요");

				}

			}catch(InputMismatchException e) {
				System.out.println("잘못된 값입니다. 다시입력해주세요");
				count ++;
				sc.nextLine();
			}

		}


	}

}
