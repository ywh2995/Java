package quiz;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 2;
		int sum =0;
		
		while(n1 != 0) {
			System.out.print("정수를 입력하세요 : ");
			n1 = sc.nextInt();
			sum += n1;
		}
		
		System.out.println("입력한 정수의 합 : " + sum);

	}

}
