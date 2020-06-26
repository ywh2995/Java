package poly.instanceof_;

public class Student extends Person{
	String studentId;
	//this 키워드 이용해서 name , age ,studentId 초기화
	Student(String name,int age,String studentId){
		super(name,age);
	
		this.studentId = studentId;
		
	}
	
	String info() {
		return super.info() + ", 학번은 "+ studentId; 
	}
	
}
