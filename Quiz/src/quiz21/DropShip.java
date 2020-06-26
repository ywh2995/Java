package quiz21;

import java.util.Arrays;

public class DropShip extends Unit {
	
	int i;
	public Unit[] unit = new Unit[8];
	
	public DropShip() {
		super(0,0,60);

	}

	@Override
	public void location() {
		System.out.println("현재위치 " + x+","+ y);
		
	}

	@Override
	public void move(int x1, int y1) {
		int road = (int) Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		
		System.out.println("이동한 거리 = "+ road);
		this.x =x1;
		this.y =y1;
		for(int i =0; i<this.i;i++) {
			unit[i].x = this.x;
			unit[i].y = this.y;
		}
		location();
		}
	
	
	public void ride(Unit unit) { 
		
//		Unit[] u = new Unit[8];
//		
//		if(this.i>4) {
//			if(unit instanceof Tank) {
//				System.out.println("\n공간부족");	
//				return;
//			}else{
//				u[this.i] = unit;
//				this.i++;
//			}
//		}
//		
//		if(this.i>7) {
//			System.out.println("\n공간부족");
//			return;
//		}else {
//			if(unit instanceof Marine) {
//				u[this.i] = unit;
//				this.i++;
//			}else if(unit instanceof Tank){
//				u[this.i]=unit;
//				this.i+=4;
//			}
//
//		}
			
//			for(int i=0;i<u.length;i++) {
//			if(u[i] instanceof Tank) {
//				System.out.print("Tank");
//				if(this.i>7 || this.i>4) {
//					return;
//				}else {
//				System.out.print(",");
//				}
//				
//			}else if(u[i] instanceof Marine) {
//				System.out.print("Marine");
//				if(this.i>7 || this.i>4) {
//					return;
//				}else {
//				System.out.print(",");
//				}
//			}
//			
//		}
		
		if(unit instanceof Marine && i <=7) {
			this.unit[i] = unit;
			i++;			
		} else if(unit instanceof Tank && i <=4) {
			this.unit[i] =unit;
			i+=4;
		} else {
			System.out.println("수송선에 공간이 부족합니다");
			return;
		}
		
		System.out.print("수송선 정보:");
		for(int j=0;j<this.unit.length;j++) {
			if(this.unit[j] instanceof Marine) {
				System.out.print("Marine ");
			}else if(this.unit[j] instanceof Tank) {
				System.out.print("Tank ");
			}
			
		}
		System.out.println( );
		
		
		//1. 배열크기8 수송선은 탱크와 마린 탑승가능 ,태크는 자리 4 마리는 1칸
//		배열에 유닛이 탈 수 있으면 유닛을 배열에 저장(탱크가 배열에 타면 인덱스, 4칸ㅇ)
//		전부 차거나 탈수 없으면 "공간부족"출력 ;
		//3. 탄 유닛 가로로 출력

		// main에서 마린 객체 4마리 , 탱크 2대 수성선 1대 생성 , 수송선 넣어서 확인
	}
}
	

