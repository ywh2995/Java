package day06;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx04 {
	public static void main(String[] args) {
		//메서드의 매개변수 , 반환유형으로 배열을 전달 하는 방법
	
		int[] arr = {1,2,3,4,5};
		
		method01(arr);
		
		String [] arr2 =method02();
		
		System.out.println(Arrays.toString(arr2));	
		
		
	}
	static void method01(int[] arr) {
		
	System.out.println(Arrays.toString(arr));
	}
	
	static String [] method02() {
		String[] week = {"월","화","수"};
		return week;
	}
	
	
	
}

