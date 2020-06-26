package quiz35;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Person {
	private String name;
	private String id;
	private String addr;
	
	
	private Scanner sc = new Scanner(System.in);
	
	
	public String inputInfo(){
		while(true) {
			System.out.print("회원번호 : ");
			this.id = sc.next();
			System.out.print("이름 : ");
			this.name = sc.next();
			System.out.print("주소 : ");
			this.addr = sc.next();
			
			break;
		}return id;
		
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	
	
	
	
}
