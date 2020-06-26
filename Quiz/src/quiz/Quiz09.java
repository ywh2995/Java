package quiz;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int n = sc.nextInt();
		
		if (n <10 && n%3!=0 && n%4!=0) {
			System.out.println("10보다 작으며 3의배수, 4의배수가 아닙니다.");
			
		}else{ 
			System.out.println("10보다 작지않거나 3의배수 , 4의배수가 맞습니다.");
		}
		 sc.close();
	}

}
