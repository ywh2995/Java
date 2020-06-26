package this_.basic;

public class Student extends Person{
	String studentId;
	//this 키워드 이용해서 name , age ,studentId 초기화
	Student(String name,int age,String studentId){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		
	}
	
	String info() {
		return "이름 : " + name +", 나이: " + age + ", 학번은 "+ studentId; 
	}
	
}
