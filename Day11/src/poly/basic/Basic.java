package poly.basic;

/*
 * 자바에서 하나의 클래스파일에 여러 클래스 선언이 가능합니다.
 * 단 , 파일명과 동일한 클래스가 존재해야하고, 해당 클래스만  public 이면 됩니다.
 * 
 */

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {

	/*
	 * 다형성
	 * 자식 객체가 부모타입을 가질 수 있는 특성입니다.
	 * 
	 */
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	
	int x = 10;
	double y = x; // int -> double 자동 형변환
	
	A a1 = b; // B -> A로 자동 형변환
	A a2 = new B();
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	
//	B b1 = new E(); 상속 관계가 없으면 다형성 적용이 불가능.
	
	Object o1 = a;
	Object o2 = new B();
	Object o3 = "asd";
	
	
	
	
	
	
	
	
}
