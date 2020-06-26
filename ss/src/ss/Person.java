package ss;

import java.util.Scanner;

public class Person {
	private String name;
	private String id;
	private String pw;

	
	private Scanner sc = new Scanner(System.in);
	
	public String inputInfo() {
		while(true) {
			System.out.print("회원 이름 : ");
			this.name = sc.next();
			System.out.print("아이디 : ");
			this.id = sc.next();
			System.out.print("패스워드 : ");
			this.pw = sc.next();
			break;
		}
		return id;
	}
	public void outputInfo() {
		System.out.printf("회원이름 : %s 회원 id: %s 회원 pw: %s\n",this.name,this.id,this.pw);
	}
	
	// getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
