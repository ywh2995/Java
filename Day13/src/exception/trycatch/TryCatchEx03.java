package exception.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.print(">");
			try {
				
			int num = sc.nextInt();
			
			}catch(Exception e) {
				System.out.println("숫자로만 입력");
				sc.nextLine();	//nextLine은 엔터값을 포함해서 값을 받음
			}finally {
				sc.close();
			}
		}
		
		
	}
}
