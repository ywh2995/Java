package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를입력하세요 : ");
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i = 0;
	
		
		while(i < arr.length ) {
			
			arr[i] = i+1;
	
			
			i++;
		}System.out.println("현재배열 : : " + Arrays.toString(arr));

	}

}
