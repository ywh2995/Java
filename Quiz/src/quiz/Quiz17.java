package quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		// 1. 입력받은 정수에서 3의 배수 이거나 4의 배수일경우만 출력

		// 2. 입력받은 정수까지 6의 배수의 합

		// 3. 1~100까지 정수 중에서 4의 배수이면서 8의 배수가 아닌 수의 개수

		// 4. 1000까지 정수중 약수의 개수를 구하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int n = sc.nextInt();
		int i = 1;

		while(n>=i) {
			if(i%3==0 || i%4==0) {
				System.out.print(i+" ");
			}
			i++;
		}	
		System.out.println();
		System.out.println("======================================");

		int sum = 0;
		i = 1;

		while(n>=i) {
			if(i%6==0) {
				sum += i;
			}i++;
		}System.out.println("6의 배수의 합 :"+sum);

		System.out.println("======================================");

		int count =0;
		i = 1;
		while(100>=i) {
			if(i%4==0 && i%8 !=0) {
				count ++;
			}i++;
		}System.out.println("100까지 수중 4의배수이면서 8의 배수가 아닌 개수 :" + count);


		System.out.println("======================================");			
		
		i = 1;
		count = 0;
		while(1000>i) {
			if(1000%i ==0) {
				count ++;
			}i++;
		}System.out.println("1000의 약수의 개수 :"+count);

		System.out.println("======================================");
		
		
		
		
	}
}


