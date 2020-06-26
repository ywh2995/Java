package thread.thread;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest thread = new ThreadTest();
		thread.setName("쓰레드1");
		thread.start();
		
		System.out.println("메인종료");
	}

}
