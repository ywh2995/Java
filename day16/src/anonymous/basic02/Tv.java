package anonymous.basic02;

public class Tv {
	
	private int volume;
	private RemoteControl remote;
	
	public Tv() {
		//remote타입을 tv에 맞게 익명객체 방법으로 초기화 해보세여
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				volume ++;
				System.out.println("TV볼륨 "+ volume);
			}
			
			@Override
			public void volumDown() {
				// TODO Auto-generated method stub
				volume --;
				System.out.println("TV볼륨 "+ volume);
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("Tv를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("Tv를 끕니다.");
			}
		};
	}
	
	
	
	//게터 세터
	public RemoteControl getRemote() {
		return remote;
	}
	
	public void setRemote(RemoteControl remote) {
		this.remote = remote;
		
	}
	
}
