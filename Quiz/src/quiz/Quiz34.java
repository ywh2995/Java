package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz34 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
//		int n = 0;
//		
//		System.out.print("금액을 투입해 주세요 >");
//		int inCoin = sc.nextInt();
//		while(n !=4 ) {
//			System.out.println("남은 금액 :" + inCoin + "원");
//		
//		String[] arr = {"[1]뎀이소다 : 400원","[2]밀키스 : 500원",
//				"[3]코카콜라 : 600원","[4]잔돈 받기"};
//		System.out.println(Arrays.toString(arr));
//		System.out.print("음료수 선택> ");
//		n = sc.nextInt();
//		int[] arr2 = {400,500,600};
//		switch(n){
//			case 1 :
//				if(inCoin - arr2[n-1] <0) {
//					System.out.println("금액이 부족합니다.");
//					inCoin =0;
//				break;
//				}
//				System.out.println(arr[n-1] + "를 받았습니다.");
//				inCoin -= arr2[0];
//				break;
//				
//			case 2 :
//				if(inCoin - arr2[n-1] <0) {
//					System.out.println("금액이 부족합니다.");
//					inCoin =0;
//				break;
//				}
//				System.out.println(arr[n-1] + "를 받았습니다.");
//				inCoin -= arr2[1];
//				break;
//			case 3 :
//				if(inCoin - arr2[n-1] <0) {
//					System.out.println("금액이 부족합니다.");
//					inCoin =0;
//				break;
//				}
//				System.out.println(arr[n-1] + "를 받았습니다.");
//				inCoin -= arr2[2];
//				
//				break;
//			case 4 :
//				
//				System.out.println("남은 금액 "+inCoin+"을 반환합니다.");
//				break;
//			default :
//				
//		}
//	}
//		
//		
		System.out.print("금액을 입력하세요 >");
		int m =sc.nextInt();
		
		end: while(true) {
			System.out.println("남은금액 ="+m+"원");
			System.out.println("[1]뎀이소다 : 400원 ,[2]밀키스 : 500원,[3]코카콜라 : 600원,[4]잔돈 받기");
			System.out.print("음료선택 >>");
			int n = sc.nextInt();
			
			switch(n) {
			case 1:
				if(m>=400){
					System.out.println("데미소다 받앗어");
					m -= 400;
					
				}else {
					System.out.println("금액이 부족");
				}break;
			case 2:
				if(m>=500){
					System.out.println("밀키스 받앗어");
					m -= 500;
					
				}else {
					System.out.println("금액이 부족");
				}break;
			case 3:
				if(m>=600){
					System.out.println("코카콜라 받앗어");
					m -= 600;
					
				}else {
					System.out.println("금액이 부족");
				}break;
			
			default:
				System.out.println("남은 금액: "+ m + "반환합니다.");
				break end;
				
			}
			
			
			
			
		}
	
		}

	}


