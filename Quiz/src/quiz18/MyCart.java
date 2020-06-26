
package quiz18;

public class MyCart {

	private int money;
	public Product[] cart = new Product[1];//상품저장할 배열
	private int i = 0;
	private int sum = 0;
	// money만 받아서 초기화
	public MyCart(int money) {
		this.money = money; 

	}
	//  buy (모든 상품을 받도록 선언)
	//		가진돈과 전달된 물건의 가격 비교해서 돈이 적으면 금액부족 후 종료
	//		물건의 가격을 머니에서 빼고 add(상품)연결


	

	public void buy(Product product) {
//		if(money <300) {
//			System.out.println("금액부족");
//			return;
//		}else if(product instanceof Tv) {
//			money -= product.price;
//			sum += money;
//			add(product);
//		}else if(product instanceof Radio) {
//			money -= product.price;
//			sum += money;
//			add(product);
//		}else if(product instanceof Computer) {
//			money -= product.price;
//			sum += money;
//			add(product);
//		}else{
//			System.out.println("잘못된 상품입니다.");
//		}
		if(this.money<product.price) {
			System.out.println("금액부족");
			return;
		}
		this.money -= product.price;
		add(product);
		
	}
	// add(모든 상품을 받도록 선언)
	//	. 만약  i의 값이 장바구니 크기보다 같거나 크다면
	//	 * 기존의 장바구니보다 크기가 2배 큰 배열 선언
	//	 * 기존의 장바구니 값을 새로운 배열에 복사
	//	 * 새로운 장바구니를 기존의 장바구니와 바꾼다
	//	 * 2. product를 장바구니에 담는다.
	//	 * 3. info 메서드 호출
	private void add(Product product) {
		if(this.i >= cart.length) {
			Product[] newCart = new Product[cart.length*2];
			for(int i=0;i<cart.length;i++) {
				newCart[i] = cart[i];
		}	cart = newCart;
		
		}
		cart[i] = product;
		i++;
		info();
	}
	//		info()
	//		장바구니안에 담긴 목록 이름 출력
	//		가격 모두 더해서 출력
	//		남은금액 출력
	//		메인서 바이 메서드 출력
	
	public void info() {
		System.out.println("=======================");
		System.out.print("현재 장바구니 :");
		
		for(int j=0;j<this.i;j++) {
			if(cart[j] instanceof Tv) {
				System.out.print(cart[j].name + " ");
				sum += cart[j].price;
			}else if(cart[j] instanceof Radio) {
				System.out.print(cart[j].name + " ");
				sum += cart[j].price;
			}else if(cart[j] instanceof Computer) {
				System.out.print(cart[j].name + " ");
				sum += cart[j].price;
			}
		}System.out.println();
		System.out.println("남은 금액 :"+ this.money+"원");
		System.out.println("계산 해야 할 금액 :"+ sum + "원");
		System.out.println();
	}
	
}
