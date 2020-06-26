package quiz41;

public class quiz extends Thread{

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("음악")) {
		System.out.println("음악을 15초간 재생합니다.");

		for(int i =0;i<15;i++){
			
			System.out.print("");
		
		try {
			sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		}System.out.println("음악종료");
		}
		if(Thread.currentThread().getName().equals("동영상")) {
		System.out.print("동영상을 다운로드 합니다.");
		for(int i =0;i<10;i++){
			System.out.print("*");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}	


		}
		System.out.println();
		System.out.println("동영상 종료");

		}
	}




}


