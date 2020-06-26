package ss;

import java.util.List;
import java.util.Scanner;

public class Pin implements InterPoint{

	@Override
	public void input(List<Person> person) {
		Person p = new Person();
		p.inputInfo();
		
		for(int i=0;i<person.size();i++) {
			if(p.getId().equals(person.get(i).getId())){
				System.out.println("이미 등록된 아이디 입니다.");
				return;
			}else {
				
			}
		}
		person.add(p);
		System.out.println(p.getName()+"님의 정보가 입력되었습니다.");
	}

	@Override
	public void showAll(List<Person> person) {
		for(int i=0;i<person.size();i++) {
			person.get(i).outputInfo();
		}
		
	}

	Scanner sc = new Scanner(System.in);
	@Override
	public void search(List<Person> person) {
		// TODO Auto-generated method stub
		System.out.print("검색할 회원의 이름을 입력하세요 :");
		String name = sc.next();
		boolean a = false;
		for(int i=0;i<person.size();i++) {
			if(name.equals(person.get(i).getName())){
				person.get(i).outputInfo();
				a=true;
				break;
				
			}
			
		}
		if(a == false) {
			System.out.println("일치하는 회원이 없습니다.");
		}
		
	}
	

	@Override
	public void findpw(List<Person> person) {
		// TODO Auto-generated method stub
		System.out.print("비밀번호 찾으실 회원의 아이디를 입력하세요 :");
		String id = sc.next();
		boolean b = false;
		for(int i=0;i<person.size();i++) {
			if(id.equals(person.get(i).getId())) {
				System.out.println("비밀번호는 "+person.get(i).getPw()+" 입니다.");
				b=true;
				break;
			}
			if(b == false) {
			System.out.println("일치하는 아이디가 없습니다.");
			}
		}
	}



}
