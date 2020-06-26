package day05;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		//입력받는 순서대로 값을 저장
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[100];
		boolean chk = true;
		int count = 0;;
		System.out.println("먹고싶은 음식 선택");
		System.out.println("입력을 중지하려며 [그만]을 입려하세요");
		
		while(true) {
			System.out.print(">");
			String menu = sc.nextLine();
			if(menu.equals("그만")) {
				System.out.println("입력을 중지합니다.");
				break;
			}
			
			
			arr[count] = menu;
			count++;
			System.out.println(Arrays.toString(arr));
			
		}
		//입력종료 후, 출력조건
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
