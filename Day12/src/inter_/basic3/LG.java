package inter_.basic3;

public class LG implements Printed{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Life is good");
		System.out.println("전원을 꼅니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Life is good");
		System.out.println("전원을 끕니다");
		
	}

	@Override
	public void print(String document) {
		// TODO Auto-generated method stub
		System.out.println("Life is good");
		System.out.println("문서내용 :"+document);
		
	}

	@Override
	public void colorPrint(String document, String color) {
		// TODO Auto-generated method stub
		System.out.println("Life is good");
		System.out.println("문서내용 :"+document);
		System.out.println("색상 : "+color);
	}

	@Override
	public int copy(int n) {
		System.out.println("Life is good");
		System.out.println(n + "장 복사");
	
		// TODO Auto-generated method stub
		return  n;
	}

}
