package quiz;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);


		System.out.print("정수를 입력하세요 :");
		int n = sc.nextInt();

		System.out.println("구구단 : "+n+"단");
		
		int i =1; 
		while(i<=9) {
			System.out.println(n+ " x "+i+" = "+ n*i);
			i++;
		}
	}

}
