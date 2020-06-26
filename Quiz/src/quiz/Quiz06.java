package quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이와 키를 입력하세요.");
		System.out.print("나이 :");
		int age = sc.nextInt();
		System.out.print("키 :");
		double cm = sc.nextDouble();
		System.out.println("======================");
		if(age>=8 && cm>140) {
			System.out.println("놀이기구 탑승이 가능합니다.");
		}else {
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}
		 sc.close();
	}
}
