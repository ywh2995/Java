package quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하세요 :");
		int num = sc.nextInt();
		int i=1;
		int sum = 0;
		while(num >= i) {
			if(num%i ==0) {
				sum +=i;
			}i++;
		}System.out.println(num+"의 약수의 합 :"+sum);

		
		
	}

}

