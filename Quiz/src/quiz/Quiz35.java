package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz35 {

	public static void main(String[] args) {
		/*
		 * 1. 사람수 입력
		 * 2. 입력받은 사람수 만큼 랜덤값 생성 ; 배열에 중복 되지않게 랜덤 저장
		 * 
		 * 3.해당 배열의 크기만큼 0으로 출력 ○ 
		 * 4.스캐너를 통해서 랜덤으로 배정된 자석을 선택할 수 있다.
		 * 5.제대로 선택된 자석이라면 자리번호 공개 하고, 제대로 선택되지않은 좌석이면 "경고문 "
		 * 
		 * 선택된 자리는  ● 으로 표기
		 */
		int count = 0; // 카운트 변수로 입력받은 수를 학생수만큼 카운트 누적하여 학생수보다 많으면 반복문 탈출

		Scanner sc = new Scanner(System.in);
		System.out.print("사람 수를 입력해 주세요 :");
		int n  = sc.nextInt();
		int i,j = 0;
		boolean t = true;
		int[] arr = new int [n];
		
		for(i=0;i<arr.length;i++) {
			int rd = (int) (Math.random()*n+1);
			arr[i] = rd;
			for(j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i-=1;
				}
			}
		}
		while(true) {
			
			for(i=0;i<arr.length;i++) {
				System.out.print("○");
				
				
			}System.out.println();
			
			System.out.println("좌석을 지정해주세여 : ");
			int c =sc.nextInt();
			
			if(arr[i] == c) {
				
				System.out.print("*");
				}
		
			} // 
			
		}
	}




	


