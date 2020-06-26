package inter_.basic2;

public class PetHouse {
	/*
	 * 1. carePet()메서드 선언
	 * 매개 변수는 모든 펫 타입을 받을 수 있도록 선언
	 * 기능 - instanceof 사용해서 캐스팅 해보고
	 * 출력 " 멍멍일르 돌봅니다 "
	 * 
	 * 2. petInfo() 메서드 선언
	 * 매개변수는 ipet [] 
	 * 아이펫 배열을 회전해서 play()실행
	 * 
	 */
	public void carePet(IPet p) {
		if(p instanceof Dog) {
			System.out.println("멍멍이를 돌봅니다.");
		}else if(p instanceof Cat) {
			System.out.println("고양이를 돌봅니다.");
		}
		else if(p instanceof GoldFish) {
			System.out.println("금붕어를 돌봅니다.");
		}
		
	}
	
	public void petInfo(IPet[] p) {
		for(IPet a : p) {
		a.play();
		}
		
	}
	
	
}
