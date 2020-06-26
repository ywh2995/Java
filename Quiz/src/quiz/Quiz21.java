package quiz;

import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {
		
		//금액의 동전  - 금액을 큰 금액부터 거슬러서 몇개가 나와야 하는지 처리
		int[] arr = {1000,500,100,50,10};
		
		int money = 295920;  // 금액
		int i = 0;
		
		int[] arr2 = new int[arr.length];
		
		while(i < arr.length) {
	
			arr2[i] = money / arr[i] ;
			
			money = money - (arr[i] * arr2[i]);
//			money = money % arr[i]; , money %= arr[i]; 
			
			i++;		
		}
		
		System.out.println(Arrays.toString(arr2));
}
}


