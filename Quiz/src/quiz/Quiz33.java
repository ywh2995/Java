package quiz;

import java.util.Scanner;

public class Quiz33 {

	public static void main(String[] args) {
		/*
		 * up down
		 * 
		 * 1~100
		 * 값 입력받기
		 * 랜덤수가 입력받은 값보다 작으면 " 더 작은수를 입력
		 * 크면 " 더큰수"
		 * 
		 * 정답이면 시도 횟수 : 출력 후 종료
		 * 
		 */
		
		
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		int rd = (int) ((Math.random()*100)+1);
		System.out.println("updow 게임");
		
		while(true) {
			System.out.print(">> ");
			int n = sc.nextInt();
			
			if(n==rd) {
			System.out.println("정답입니다.");
			System.out.println("");
			break;
		}if(rd<n){
			System.out.println("더 작은 수를 입력해주세여");
			count++;
		}else {
			System.out.println("더 큰 수를 입력해주세여");
			count++;
		}	
		}System.out.println("시도 횟수 :"+count);
		
		sc.close();
	}

}
