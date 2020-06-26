package anonymous.basic02;

public class MainClass {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		
//		com.serRemote(new RemoteControl() {
//			
//			@Override
//			public void volumeUp() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void volumDown() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void turnOn() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void turnOff() {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		com.getRemote().turnOn();
		com.getRemote().volumeUp();
		com.getRemote().volumDown();
		com.getRemote().turnOff();
		
		Tv tv = new Tv();
		tv.getRemote().turnOff();
		
		
		
		
		
	}

}
