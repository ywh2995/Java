package static_.field;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		System.out.println(c1.a + " 일반멤버변수");
		System.out.println(c1.b + " 정적멤버변수");
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println(c2.a + " 일반멤버변수");
		System.out.println(c2.b + " 정적멤버변수");
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		System.out.println(c3.a + " 일반멤버변수");
		System.out.println(c3.b + " 정적멤버변수");
	
		System.out.println("[---------------------]");
		
		/*
		 * 1.static은 클래스 밖에 1개 생성된다. 의미를 갖습니다.
		 * 객체 생성없이 클래스 이름, 변수명  으로 사용할 수 있습니다.
		 * 
		 * 
		 */
		
		Count.b++;
		Count.b =100;
		
		System.out.println(c1.b);
		System.out.println(c2.b);
		System.out.println(Count.b);
		
		System.out.println();
	}
	
	
	
	

}
