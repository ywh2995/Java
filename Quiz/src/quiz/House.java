package quiz;

import java.util.Arrays;

public class House{
	
	int count;
	private Person[] persons;
	public House() {
		persons = new Person[10];
			
	}
	public void getIn(Person p) {
		persons[count] = p;
		count++;
		
	}
	public void print() {
		for(int i=0; i<count;i++) {
			System.out.println("이름 :"+persons[i].getName()+"나이 :"+persons[i].getAge());
		}
	
	}

	public Person[] getter() {
		return persons;
	}
	
}
