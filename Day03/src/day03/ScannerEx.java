package day03;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
	   	
		// 1. 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 2. 스캐너가 가지고 있는 입력 기능을 통해서 데이터를 입력받음
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 :");
		int age = sc.nextInt();
		
		
		System.out.print("키 : ");
		double cm = sc.nextDouble();
		
		System.out.print("자기소개 : ");
		sc.nextLine();
		String intro = sc.nextLine();
		
		System.out.printf("이름 : %s,나이 : %d, 키 : %.0f\n 자기소개 :%s ",name,age,cm,intro);
		
	}
}
