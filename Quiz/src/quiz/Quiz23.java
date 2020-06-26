package quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		// 1.7~100까지 정수중 7의 배수 가로 출력
		// 2.1~100 12배수 
		// 3.1~200 9의배수 개수
		// 4.50~100 정수의합
		// 5.A~Z까지 출력
		// 6.입력받은정수의 펙토리얼
		
		System.out.print("7의배수 =");
		for(int i=7;i<=100;i++) {
			
			if(i%7==0) {
				System.out.print(" "+i);
			}
		}
		System.out.println();
		System.out.println("========================================================");
		System.out.print("12의배수 =");
		for(int i=12;i<=100;i++) {
			if(i%12==0) {
				System.out.print(" "+i);
			}
		}
		System.out.println();
		System.out.println("========================================================");
		
		int count =0;
		for(int i=1;i<=200;i++) {
			if(i%9==0){
				count ++;
			}
		}
		
		System.out.println("9의배수의 개수:"+count);
		
		System.out.println("========================================================");
		
		int sum=0;
		for(int i=50;i<=100;i++) {
			sum += i;
			}
		System.out.println("50~100사이의 수들의 합 :"+sum);
		System.out.println("========================================================");
		
		for(char i='A'; i <='Z'; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("========================================================");
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int n = sc.nextInt();
		int pac = 1;
		
		for(int i = 1; i<=n; i++) {   
			
			 pac *= i;
	
			
		}
		System.out.println(n+"! = "+ pac);
		
		
		
	}

}
