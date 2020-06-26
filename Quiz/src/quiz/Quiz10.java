package quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		/*
		 * 정수 3개를 입력 받습니다.
		 * 가장 큰값, 가장 작은값, 중간값을 구해서 출력.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력해주세여");
		System.out.print(">> ");
		int a = sc.nextInt();
		System.out.print(">> ");
		int b = sc.nextInt();
		System.out.print(">> ");
		int c = sc.nextInt();

		System.out.println(a + " "+ b+ " "+ c );
		
		if(a>b && a>c && b>c) {
			System.out.println("가장큰값 :"+a+" 중간 값:"+b+" 가장 작은값 :"+c);
		}
		else if(a>b && a>c && c>b) {
			System.out.println("가장큰값 :"+a+" 중간 값:"+c+" 가장 작은값 :"+b);

		}
		else if(b>a && b>c && c>a) {
			System.out.println("가장큰값 :"+b+" 중간 값:"+c+" 가장 작은값 :"+a);
			
		}
		else if(b>a && b>c && a>c) {
			System.out.println("가장큰값 :"+b+" 중간 값:"+a+" 가장 작은값 :"+c);		
		}		
		else if(c>a && c>b && b>a) {
			System.out.println("가장큰값 :"+c+" 중간 값:"+b+" 가장 작은값 :"+a);
		}
		else if(c>a && c>b && a>b) {
		}else {
			System.out.println("모두같음");
			
		}
	}

}


