package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수1 >");
		int a = sc.nextInt();
		String[] arr= {"+", "-", "*", "/"};
		
		System.out.println("연산을 선택하세요 : "+Arrays.toString(arr));
		String ad = sc.next();
		System.out.print("정수2 >");
		int b = sc.nextInt();
		
		switch(ad ) {
		case "+":
			System.out.println("두 수의 덧셈은 :"+ (a+b));
				break;
		case "-":
			System.out.println("두 수의 뺄셈은 :"+ (a-b));
				break;
		case "*":
			System.out.println("두 수의 곱셈은 :"+ (a*b));
				break;
		case "/":
			System.out.println("두 수의 나눗셈은 :"+ (a/b));
				break;
				
		}
		
		
		
		
		
		
			
	}

}
