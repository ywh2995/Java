package quiz23;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 인터페이스 형으로 선언하고 무한반복문 안에서 
		 * 음악을 추가하는 기능, 재생기능, 종료기능  
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("====================MelonMusic===================");


		SongList m = new MelonMusic();



		while(true) {
			System.out.println("음악추가 하시려면 1번을 입력해주세여");
			System.out.println("실행 하시려면 2번을 입력해주세요");
			System.out.println("종료를 원하실 시 3을 입력해주세요");
			System.out.print(">> ");
			int start = sc.nextInt();

			if(start == 1) {
				System.out.print("음악을 입력하세요 :");
				String music = sc.next();
				m.insertList(music);

			}
			else if(start ==2){

				m.playList();

			}
			else if(start==3) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}

