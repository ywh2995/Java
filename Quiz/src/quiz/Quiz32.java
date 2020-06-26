package quiz;

import java.util.Scanner;

public class Quiz32 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count1 =0;
		int count2 =0;
	
		while(true) {
			int rd1 = (int) ((Math.random()*100)+1);
			int rd2 = (int) ((Math.random()*100)+1);
			int rd3 =(int) (Math.random()*2);
			
			if(rd3==0) {
			
			System.out.printf("%d - %d = ?\n",rd1,rd2);
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.print( " >> ");
			}else {
				System.out.printf("%d + %d = ?\n",rd1,rd2);
				System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
				System.out.print( " >> ");
			}
			int a = sc.nextInt();
			
			if(a==0) {
				
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(a==(rd1+rd2)){
				System.out.println("정답입니다!");
				count1 ++;
			}else {
			System.out.println("오답입니다!");
			count2 ++;
			}
			System.out.println("-----------------------------");
			
		}System.out.println("정답 횟수 :"+ count1);
		System.out.println("오답 횟수 :"+ count2);
	}

}
