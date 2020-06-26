package anonymous.basic;

interface Car {
	public void run();
	
}

class Tico implements Car{

	@Override
	public void run() {
		System.out.println("티코~");
		// TODO Auto-generated method stub
		
	}
	
}


//클래스
public class Garage {
	
	//멤버변수
//	public Car car = new Tico();
	public Car car = new Car() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("익명 객체 티코입니다.");
		}
	};
	

}
