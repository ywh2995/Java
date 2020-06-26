package day07;

public class Phone {
	
	String model;
	int price;
	String color;
	
	//생성자 : 생성자는 클래스이름과 대소문자 까지 동일
	//반환유형 : x
	
	
	Phone() {
		System.out.println("생성자 호출");
		model = "큐리텔";
		price = 200000;
		color = "검정";
	}
	
	// 생성자는 중복해서 여러개 선언 ㄱㄴ
	// 단 매개변수의  종류 개수가 달라야함
	Phone(String pColor){
	
		model = "애니콜";
		price = 300000;
		color = pColor;
		
	}
	Phone(String pColor,int pPrice){
		model="가로본능";
		color = pColor;
		price = pPrice;
		
	}
	Phone(String pColor,String pModel){
		model = pModel;
		price = 500000;
		color = pColor;
	}
	//모든 멤버변수 받는 생성자 생성
	//그린,1000000,샤오미 개채 생성
	Phone(String pColor,String pModel,int pPrice){
		model = pModel;
		price =pPrice;
		color = pColor;
	}
	
	
	void info() {
		System.out.println("========폰정보 ========");
		System.out.println("모델 :"+model);
		System.out.println("가격 :"+price);
		System.out.println("색상 :"+color);
		
	}
}
