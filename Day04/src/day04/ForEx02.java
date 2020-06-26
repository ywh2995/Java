package day04;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		// 정수를 받아서 해당 정수가 소수인지 판별.
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 >> ");
		int n = sc.nextInt();
		int count=0;
		for(int i=1; i<=n; i++) {

			if(n % i == 0) {
				count ++;
			}
		}
		System.out.println(count == 2? n +"는 소수" :"소수가 아닙니다." );


	}

}
