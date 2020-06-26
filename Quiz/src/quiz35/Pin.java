package quiz35;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pin implements Inter{


	Scanner sc = new Scanner(System.in);
	Person p = new Person();
	@Override
	public void input(Map<String,String> person) {

		p.inputInfo();

		for(int i=0;i<person.size();i++) {
			if(person.containsKey(p.getId())){
				System.out.println("이미등록된 회원번호 입니다.");
			}
		}
		person.put(p.getId(),p.getName()+" "+p.getAddr());
		System.out.println(p.getName()+"님의 정보가 입력됐습니다.");
	}

	@Override
	public void search(Map<String, String> person) {
		System.out.print("검색할 회원번호를 입력하세요 : ");
		String name = sc.next();
		if(person.containsKey(name)){
			System.out.println("회원 아이디 : "+ p.getId()+ " 회원 이름 : "+ p.getName()+" 회원 주소 : "+p.getAddr());
			return;
		}
		System.out.println("없는 회원입니다.");
	}

	@Override
	public void set(Map<String, String> person) {
		System.out.print("수정할 회원의 번호를 입력하세요 : ");
		String id = sc.next();
		if(person.containsKey(id)){
			System.out.print("수정할 이름을 입력하세요 :");
			String name = sc.next();
			p.setName(name);
			System.out.print("수정할 주소를 입력하세요 ");
			String addr = sc.next();
			p.setAddr(addr);
			

			person.put(p.getId(),p.getName()+" "+p.getAddr());
			return;
		}
		System.out.println("없는 회원입니다.");
	}



	@Override
	public void delete(Map<String, String> person) {
		System.out.print("수정할 회원의 번호를 입력하세요 : ");
		String name = sc.next();
		if(person.containsKey(name)){
			
			person.remove(name);
			System.out.println(p.getName()+"님의 정보가 삭제됐습니다.");
			return;

		}
		System.out.println("없는 회원입니다.");
	}

	@Override
	public void showAll(Map<String, String> person) {
		// TODO Auto-generated method stub
		
	}

}



