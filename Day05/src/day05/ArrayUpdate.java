package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {
		
		boolean chk = true;
		Scanner sc = new Scanner(System.in);
		String[] arr = {"강타","문희준","토니안","장우혁","이재원"};
		
		System.out.print("수정할 학생의 별명을 입력 >> ");
		String name = sc.next();
		int i =0;
		for(i=0;i<arr.length;i++) {
			if(name.equals(arr[i])) {
			System.out.print("수정할이름 :");
				arr[i] = sc.next();
			
			}
		
		}
		if(chk) {
			System.out.println("별명이 존재하지않습니다.");
		}else {
			System.out.println(Arrays.toString(arr));
		}

	}

}
	
