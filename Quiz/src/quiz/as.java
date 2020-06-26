package quiz;

import java.util.Scanner;

public class as {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("세로 :");
		int y = sc.nextInt();
		System.out.print("가로 :");
		int x = sc.nextInt();
	
		for(int i = 0; i<y; i++) {
			for(int j = 0; j<x; j++) {
				
				if(y==0 || y==y) {
					System.out.print("*");
				}else if(x==0||x==x) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			System.out.println(" ");	}
		}
		
		
	}

// 첫번째 for문은 y축을 몇번 출력
// 두번째 for문은 x축을 몇번