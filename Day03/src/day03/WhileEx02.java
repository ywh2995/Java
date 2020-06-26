package day03;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		// 입력받은 수가 소수인지 판별
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수입력 >");
		int num = sc.nextInt();
		
		int i =2;
		while(num % i != 0) {
		i++;
		}
		System.out.println(num==i?num +"은 소수" : num + "은 소수가 아닙니다.");
	}
}
