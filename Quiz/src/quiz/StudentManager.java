package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	static String [] nameList = new String[100];
	static String [] genderList = new String[100];
	static String [] emailList = new String[100];
	static int[] birthList = new int[100];
	//현재 고객수가 몇명이 저장되었는지 알기 위한 변수 count선언
	static int count = 0;
	//index 조정할 변수 선언
	static int index = -1;

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);



		end:	while(true) {
			System.out.println("[Info]-고객수: "+ count + ", 현재위치: "+ index);
			System.out.println("[메뉴]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
			System.out.print("메뉴 입력 >");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("============== 고객정보를 입력합니다.============");
				insertData();
				count ++;
				break;


			case 2:
				System.out.println("============== 이전 고객 정보를 출력합니다.============");
				if(index<=0) {
					System.out.println("이전고객정보가 없습니다.");
				}else {
					index--;
					printData(index);
				}
				break;


			case 3:
				System.out.println("============== 다음 고객 정보를 출력합니다.============");
				if(index>=count-1) {
					System.out.println("다음 고객 정보가 없습니다.");
				}else {
					index++;
					printData(index);
				}
				break;



			case 4:
				System.out.println("==============현재 고객 정보를 출력합니다.============");
				if(index>=0 && index<count) { // 출력가능조건
					printData(index);
				}else {
					System.out.println("현재고객 정보가 없습니다.");
				}
				break;



			case 5:
				System.out.println("============== 현재 고객 정보를 수정합니다.============");
				updateData(index);
				break;



			case 6:
				deleteData(index);
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

	//고객정보를 입력받는 메서드
	static void insertData(){

		Scanner sc = new Scanner(System.in);
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
                                                                                                                                            
	}
	//고객정보를 출력하는 메서드,
	static void printData(int index) {

		System.out.println("이름 :"+nameList[index]+"성별 :"+genderList[index]+"이메일 :"+emailList[index]+"생년월일 :"+birthList[index]);

	}
	//고객정보를 수정하는 메서드
	static void updateData(int index) {
		Scanner sc = new Scanner(System.in);

		if(index>=0 && index<count) {
			System.out.print("이름 :");
			String name =sc.next();
			nameList[index] = name;

			System.out.print("성별 :");
			String gend =sc.next();
			genderList[index] = gend;

			System.out.print("이메일 :");
			String email =sc.next();
			emailList[index] = email;

			System.out.print("생년월일 :");
			int birth =sc.nextInt();
			birthList[index] = birth;
		}else {
			System.out.println("현재정보가 없습니다.");
		}

	}
	//고객정보를 삭제하는 메서드
	static void deleteData(int index) {
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

	}
 



}
