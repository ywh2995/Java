package inter_.basic3;

public class Samsung implements Printed{
	public String name = "삼성";
	@Override
	public void turnOn() {
		System.out.println(name);
		System.out.println("전원을 꼅니다");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println("전원을 끕니다");
	}

	@Override
	public void print(String document) {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println("문서내용 :"+document);
	}

	@Override
	public void colorPrint(String document, String color) {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println("문서내용 :"+document);
		System.out.println(color+"색 출력 "+document);
	}

	@Override
	public int copy(int n) {
		// TODO Auto-generated method stub
		for (int i = 1 ; i<=n;i++) {
			System.out.println(i+"장 복사 완료");
		}
		return n;
	}

}
