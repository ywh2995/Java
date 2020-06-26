package quiz;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력하세요");
		System.out.print("> ");
		int n1 = sc.nextInt();
		System.out.print("> ");
		int n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.printf("%d 가 큰수입니다.",n1);
		}else if (n1 == n2) {
			System.out.println("같은수 입니다.");
			
		}else if (n1<n2){
			System.out.printf("%d 가 큰수입니다",n2);
		}
		 sc.close();	
	}
}
