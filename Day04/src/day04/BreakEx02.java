package day04;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		while(true) {
			
			System.out.println("4X6 = ?");
			System.out.print("> ");
			int n = sc.nextInt();

			if(n==24) {
				System.out.println("정답입니다.");
				break;
			
			}else {
				System.out.println("오답입니다");
				}
			}
		sc.close();
	}

}
