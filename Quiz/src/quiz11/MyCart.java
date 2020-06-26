package quiz11;

import java.util.Arrays;

public class MyCart extends Cart {


	// 1. 여기 생성자에서 int 매개 받고 금액 초기화 (티비 300, 컴터 400, 라디오 500)
	// 2. buy(),add(),info() 메서드를 오버라이딩
	/*
	 * buy()의 기능
	 * 1.money가 300보다 작으면 "금액부족 " 출력 후 메서드 종료
	 * 2. 매개변수가 tv,com,radio아니면 "상품없음" 출력 후 종료
	 * 매개변수가 tv면 금액에서 tv가격 빼고 add(상품)을 호출
	 * 
	 * 
	 */

	/*
	 * add()의 기능
	 * 1. 만약  i의 값이 장바구니 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 2배 큰 배열 선언
	 * 기존의 장바구니 값을 새로운 배열에 복사
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다
	 * 2. product를 장바구니에 담는다.
	 * 3. info 메서드 호출
	 * 
	 */

	/* 
	 * info()
	 * 1.물건을 사고 남은 금액을 구하고
	 * 2.장바구니 담긴 물건 목록 + 금액 더해서 출력
	 * 메인에서 buy()실행
	 * 
	 * 
	 * 
	 */
	


	MyCart(int money) {
		this.money = money;
		this.tv = 300;
		this.com=400;
		this.radio=500;
		
	}

	void buy(String product) {

		
			if(money<300) {
				System.out.println("금액부족");
				return;
			}else if(product.equals("tv")) {
				money -= tv;
				add(product);
				
				return;
			}else if(product.equals("com")) {
				money -= com;
				add(product);
				
				return;
			}else if(product.equals("radio")) {
				money -= radio;
				add(product);
				
				return;
			}else {
				System.out.println("상품없음");
				return;
			}
		
	}
	void add(String product) {
		if(i>=cart.length) {
			String[] cart2=new String[cart.length*2];
			
			for(int j =0; j<cart.length;j++) {
				cart2[j] = cart[j];
			}
			cart= cart2;
			
		}
		cart[i] =product;
		
		
		i++;
		info();


	}



	void info() {
		System.out.println("-------장바구니 목록------");
		for(int j = 0; j<i; j++) {
			System.out.print(cart[j] +" ");
		}
		System.out.println("\n남은 금액 :"+money);
		
//		System.out.println("현재 cart에 담긴 물건 :"+Arrays.toString(cart));
		
	}
}
