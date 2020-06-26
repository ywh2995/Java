package quiz;

import java.util.Scanner;

public class MethodQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		// print
		System.out.println("정수 두개를 입력 하세여 :");
		
		//input method 2번
		System.out.println(">>");
		int a = sc.nextInt();
		System.out.println(">>");
		int b = sc.nextInt();
		
		// add() 
		int result = a+b;
		// result 출력 
		System.out.println("결과는 :"+result);
		
		print();
		int c = input();
		int d = input();
		int ddd = add(c,d);
		
		result(ddd);
		
		
		sc.close();
	}
	static void print() {
		System.out.println("정수 두개를 입력하세요 :");
	}
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		return d;
		
	}
	static int add(int a,int b) {

		return a+b;
	}
	static void result(int dd) {

		System.out.println("결과는  : " +dd);
	}
	
	
	
}
