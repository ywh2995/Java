package quiz;

import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {
		// 가로 세로 입력받고
		// 가로 길이 세로길이 사각형 출력
		// 윤곽만 나타나게
		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입려하세요 : ");
		int w = sc.nextInt();
		System.out.print("세로를 입려하세요 : ");
		int h = sc.nextInt();



		for (int i=0; i<h; i++) {
			
			for(int j =0;j<w; j++) {
				
				if(i==0 || i==(h-1)) {
					System.out.print("*");
				}else if(j==0 || j==(w-1)){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}

	}

}





