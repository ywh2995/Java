package overrding.basic;

public class Imployee extends Person{
String department;
String info() {
	return "이름 : " + name +", 나이: " + age+", 부서:"+department;
}
}