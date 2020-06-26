package quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세여");
		System.out.print("> ");
		int n = sc.nextInt();
		
		if(n==0) {
			System.out.printf("입력한 정수는 %d입니다.",n);
			
		}else if(n<0) {
			System.out.printf("%d 는 음의정수입니다.",n);
		}else if(n%2!=0) {
			System.out.println("홀수입니다.");
		}else  {
			System.out.println("짝수입니다.");
		} sc.close();
	}

}
