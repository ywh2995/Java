package encap.bad;

public class MainClass {	
	public static void main(String[] args) {
		
		// 멤버변수를  public 으로 선언하면 잘못된 값이 저장될 수도 있다.
		
		MyDate me = new MyDate();
		me.year = 1997;
		me.month = 4;
		me.day = 17;
		me.ssn = "이게 뭐죠?";
		
		me.info();
		
		
		
	}

}
