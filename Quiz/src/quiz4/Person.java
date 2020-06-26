package quiz4;

public class Person {
	 String name;
	 int age;
	 int tall;
	 
	 Person(){
	 }
	 
	
	void info() {
		System.out.println("============================");
		System.out.println(name);
		System.out.println(age+"세");
		System.out.println("키 :"+ tall);
}
	 Person(String pName,int pAge,int pTall) {
		name=pName;
		age = pAge;
		tall =pTall;
		
	}
	
}
