package final_.field;

public class Person {
	public final String nation = "대한민국";
	public final String ssn;
	public String name;
	
	/*
	 * final 변수는 값이 대입되면 변경할 수 없기 때문에 
	 * 직접 초기화 하거나 , 생성자를 통해 초기화를 해야함.
	 */
	public Person(String ssn,String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
	
	
	
}
