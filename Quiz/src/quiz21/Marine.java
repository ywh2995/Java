package quiz21;

public class Marine extends Unit {
	
	public static int attack=6;
	public static int armor=0;
	
	public Marine() {
		super(0,0,60);
		
	}

	@Override
	public void location() {
		// 마린의 현재 위치 x,y값을 출력하는 기능
		System.out.println("현재위치 " + x+","+ y);
		
	}

	@Override
	public void move(int x1, int y1) {
		// 현재 좌표값에서 매개변수의 좌표 만큼 이동한 거리를 구하면 됩니다.
		// 루트 근사값은 Math.sqrt(제좁근)을 이용
		
		// 2.현재 좌표값을 매개변수의 좌표값으로 변경
		// 3.이동한 거리를 정수형으로 출력
		// 4.location() 메서드 호출
		
		int road = (int) Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		
		System.out.println("이동한 거리 = "+ road);
		x =x1;
		y =y1;
		location();
		
	}
	
}
