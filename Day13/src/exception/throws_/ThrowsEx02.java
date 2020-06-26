package exception.throws_;

public class ThrowsEx02 {

	public void aaa(int i) throws Exception{
		System.out.println("aaa 호출");
		System.out.println(10/i);
		System.out.println("bbb 종료");
	}
	public void bbb() throws Exception{
		System.out.println("bbb호출");
		
		try {
			aaa(0);
			
		}catch(Exception e) {
			System.out.println("0으로 나눌수 없음");
		}
		System.out.println("Bbb 종료");
	}
	public ThrowsEx02() throws Exception{
		System.out.println("생성자 호출");
		bbb();
		System.out.println("생성자 종료");
	}
}
