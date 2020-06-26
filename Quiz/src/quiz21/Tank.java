package quiz21;

public class Tank extends Unit{
	
	
	
	public Tank() {
		super(0,0,100);
	}	
	
	public void changeMode() {
		
	}

	@Override
	public void location() {
		
		System.out.println("현재위치 " + x + ","+ y);
	}

	@Override
	public void move(int x1, int y1) {
		
		
		int road = (int) Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		
		System.out.println("이동한 거리 = "+ road);
		x =x1;
		y =y1;
		
		location();
		
	}	
		
}
