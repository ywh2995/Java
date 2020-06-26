package quiz;

import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {

		// 두 정수를 입력받습니다.
		// 두 수의 크기는 정해지지 않았습니다.
		// 두 수 사이의 합을 구하는 코드를 최대한 간략 하게

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
//		int sum = 0; 
//		if(n1>=n2) {
//			
//			for(int i =n2; i <=n1; i++ ) {
//				sum += i;
//			}
//		}else{
//			for(int i =n1; i<=n2; i++) {
//				sum+=i;
//			}
//		}System.out.println(sum);
		
		int sum=0;
		for(int i = (n1==n2 ?0:(n1>n2?n2:n1)); i<=(n1==n2 ?0:(n1>n2?n1:n2)); i++) sum+=i;
		System.out.println(sum);
		
	}

}
