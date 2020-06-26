package quiz31;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuiz02 {

	public static void main(String[] args) {
		/*
		 * 1. user클래스는 은닉된 변수로 name,age선언
		 * user 클래스의 생성자 선언
		 * 
		 * 2. user클래스 저장할수있는 ArrayList 선언
		 * 3. user객체를 2개 생성해서 리스트에 추가하세요.
		 * 
		 * 4. list에 저장된 모든 이름, 나이를 for문으로 출력, 향상된for문도 
		 * 5. list에 홍길자가 있다면 홍길자의 이름 나이만 출력
		 * 
		 * 6. list 홍길동이 있으면 객체삭제
		 */

		List<User> list = new ArrayList<User>();

		User u1 = new User("홍길동",20);
		User u2 = new User("홍길자",30);
		User u3 = new User("이순신",40);
		list.add(u1);
		list.add(u2);
		list.add(u3);

		for(int i=0; i<list.size();i++) {

			User u = list.get(i);
			System.out.println(u.getName());
			System.out.println(u.getAge());
		}

		System.out.println("===========================");
		for(User u:list) {
			System.out.println(u.getName());
			System.out.println(u.getAge());

		}

		System.out.println("===============================");
		for (int i =0; i<list.size();i++) {
			if(list.get(i).getName().equals("홍길자")) {
				System.out.println(list.get(i).getName());
				System.out.println(list.get(i).getAge());
			}

		}
		System.out.println("====================================");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("홍길동")) {
				list.remove(i);

			}
			System.out.println(list.toString());
		}
	}
}

