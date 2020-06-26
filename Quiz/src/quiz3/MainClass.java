package quiz3;

public class MainClass {

	public static void main(String[] args) {
		// 현실물건 표현 2개이상  
		//멤버 3개 메서드 3개
		// 생성해서 사용
		Clothes c1 = new Clothes();
		c1.color = "검정색";
		c1.design = "오버핏";
		c1.price = 40000;
		c1.info();
		c1.in();
		
		System.out.println("==============================");
		Clothes c2 = new Clothes();
		c2.color = "화이트";
		c2.design ="세미핏";
		c2.price = 43000;
		c2.info();
		c2.in();
	}

}
