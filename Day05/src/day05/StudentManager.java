
package day05;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String [] nameList = new String[100];
		String [] genderList = new String[100];
		String [] emailList = new String[100];
		int[] birthList = new int[100];

		//현재 고객수가 몇명이 저장되었는지 알기 위한 변수 count선언
		int count = 0;
		//index 조정할 변수 선언
		int index = -1;

		end:	while(true) {
			System.out.println("[Info]-고객수: "+ count + ", 현재위치: "+ index);
			System.out.println("[메뉴]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
			System.out.print("메뉴 입력 >");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("============== 고객정보를 입력합니다.============");
				/*
				 이름  성별 출생년도 입력받아서 각각 배열에 저장
				 사람 수를 증가 
				 */
				System.out.print("이름 :");
				String name =sc.next();
				nameList[count] = name;

				System.out.print("성별 :");
				String gend =sc.next();
				genderList[count] = gend;

				System.out.print("이메일 :");
				String email =sc.next();
				emailList[count] = email;

				System.out.print("생년월일 :");
				int birth =sc.nextInt();
				birthList[count] = birth;

				count ++;

				break;
			case 2:
				System.out.println("============== 이전 고객 정보를 출력합니다.============");
				/*
				 * index가 0이하라면 "이전고객정보가 없습니다."
				 * 그렇지않으면 index를 이동해서 이전 고객정보를 출력
				 * 
				 */
				if(index<=0) {
					System.out.println("이전고객정보가 없습니다.");
				}else {
					index--;
					System.out.println("이름 :"+nameList[index]+"성별 :"+genderList[index]+"이메일 :"+emailList[index]+"생년월일 :"+birthList[index]);
				}

				break;
			case 3:
				System.out.println("============== 다음 고객 정보를 출력합니다.============");
				/*
				 * 다음 고객정보를 출력 할 수 없는 조건을 생각해서 "다음고객정보가 없습니다"
				 * 그렇지않음  index이동해서 다음 고객정보 출력
				 */
				if(index>=count-1) {
					System.out.println("다음 고객 정보가 없습니다.");
				}else {
					index++;
					System.out.println("이름 :"+nameList[index]+"성별 :"+genderList[index]+"이메일 :"+emailList[index]+"생년월일 :"+birthList[index]);
				}
				break;

			case 4:
				System.out.println("==============현재 고객 정보를 출력합니다.============");
				/*
				 * 현재 정보를 출력할 수 있는 조건을 생각해서 현재 정보 출력
				 * 그렇지않으면 "현재 고객정보가 없습니다." 출력
				 */
				if(index>=0 && index<count) { // 출력가능조건
					System.out.println("이름 :"+nameList[index]+"성별 :"+genderList[index]+"이메일 :"+emailList[index]+"생년월일 :"+birthList[index]);
				}else {
					System.out.println("현재고객 정보가 없습니다.");
				}
				break;

			case 5:
				System.out.println("============== 현재 고객 정보를 수정합니다.============");
				/*
				 *현재 정보를 출력할 수 있는 조건을 생각해서 ㅌ1
				 *스캐너를 통해 순서대로 이름,성별,이메일 출생년도 입력받아서 배열의 값을 수정
				 *그렇지않음 수정할 데이터 없습니다.
				 */
				if(index>=0 && index<count) {
					System.out.print("이름 :");
					name =sc.next();
					nameList[index] = name;

					System.out.print("성별 :");
					gend =sc.next();
					genderList[index] = gend;

					System.out.print("이메일 :");
					email =sc.next();
					emailList[index] = email;

					System.out.print("생년월일 :");
					birth =sc.nextInt();
					birthList[index] = birth;
				}else {
					System.out.println("현재정보가 없습니다.");
				}

				break;

			case 6:

				/* 현재정보를 삭제할 수 있는 조건을 생각해서
				 * 현재 index 브터 ~~뒤에 있는 배열요소 당겨와 덮어
				 * 고객수 감소
				 * 그렇지안ㅇㅎ으면 " 삭제데이터 존재 x"출력
				 * 
				 */

				if(index>=0 && index<count) {
					System.out.println(nameList[index]+"님 정보를 삭제합니다.");
					for(int i=index;i<count-1;i++) {

						nameList[i] =nameList[i+1];
						genderList[i] =genderList[i+1];
						emailList[i] =emailList[i+1];
						birthList[i] =birthList[i+1];
					}
					count --;
				}else {
					System.out.println("삭제할 정보가 없습니다.");
				}
				break;


			case 7:
				System.out.println("프로그램을 종료합니다.");

				sc.close();
				break end;

			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
				break;
			}

		}


	}

}
