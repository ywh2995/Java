package abs.bad;

public class SeoulStore extends HeadStore{

	@Override
	public void apple() {
		System.out.println("서울지점 사과 500원 입니다.");	
	}

	@Override
	public void banana() {
		System.out.println("서울지점 바나나 500원 입니다.");	
	}

	@Override
	public void melon() {
		System.out.println("서울지점 멜론 500원 입니다.");
	}
	// 실수로 ㅁㅔ서드 재정의 빼먹었다면..?
	

}
