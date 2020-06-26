package quiz;

import java.util.Scanner;

public class Quiz30 {

	public static void main(String[] args) {
		// Q14
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		int count = 0;
		int sum =0;
		for(int i=1;i<=n;i++) {
			count =0;
			for(int j=1;j<=i;j++) {
		
				if(i%j==0) {
					count++;
				}
		}
			if(count ==2) {
				sum += i;
			}
			
		}System.out.println(sum);
		
	}

}
