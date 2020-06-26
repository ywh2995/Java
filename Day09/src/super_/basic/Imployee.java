package super_.basic;

public class Imployee extends Person{
String department;


public Imployee(String name,int age,String department) {
	super(name,age);
	this.department = department;
}
String info() {
	return super.info()+", 부서:"+department;
}
}