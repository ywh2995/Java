package poly.basic3;

import java.util.Arrays;

public class House {
	
//	private Student[] students;
//	private Imployee [] imployees;
//	private Teacher[] teachers;
//	
//	private int count1 = 0;
//	private int count2 = 0;
//	private int count3 = 0;
//	
//	public House(){
//		students = new Student[100];
//		teachers = new Teacher[100];
//		imployees = new Imployee[100];
//	}
//	
//	public void setIn(Student s) {
//		
//		students[count1] = s;
//		count1 ++;
//	}
	
	
	/*
	 * 1.300개 크기 person배열
	 * 2.count  qustn
	 * 3.setIn 모든 자식 클래스 받아서  person배열에 저장되게
	 * 4. 메인클래스에서 7명 펄슨 전달
	 */
	private Person[] persons;
	
	private int count;
	
	public House(){

		persons = new Person[300];
		
	}
	
	public void setIn(Person p) {
		
		persons[count] = p;
		count ++;
		System.out.println(Arrays.toString(persons));
	}
	public Person[] getIn() {
		return persons;
	}
	
	
	
	
}
