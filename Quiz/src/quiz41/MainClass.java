package quiz41;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quiz p = new quiz();
		quiz p1 = new quiz();
		
		Thread t = new Thread(p,"음악");
		Thread t1 = new Thread(p1,"동영상");
		
		t.start();
		t1.start();
		
		
	}

}
