package quiz11;

public class Cart {
	//부모클래스 - 장바구니가 가져야 하는 변수를 선업합니다.
	String[] cart = new String[1];

	int money;
	int i=0; // 배열 인덱스에 사용될 변수

	int tv;  //상품가격
	int com ;
	int radio;


	void buy(String product) {
	System.out.println("재정의");
	}
	void add(String product) {
		System.out.println("재정의");	
	}
	void info() {
		System.out.println("재정의");

	}

}
