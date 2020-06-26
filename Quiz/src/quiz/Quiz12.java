package quiz;

public class Quiz12 {

	public static void main(String[] args) {

		// 랜덤 으로 0~3
		// 배열에 적용
		// 선택된 단어가 한국어 영어 중국어 인지 처리
		
		int rd = (int) (Math.random()*4);
		String [] arr ={"안녕","hello","니하오","#%$"};
	
		System.out.println(arr[rd] +"은");
		
		switch(rd) {
		
		case 0:
			System.out.println("한국어 입니다.");
			break;
		case 1:
			System.out.println("영어 입니다.");
			break;
		case 2:
			System.out.println("중국어 입니다.");
			break;
		case 3:
				System.out.println("오류입니다.");
		}
		
	}

}
