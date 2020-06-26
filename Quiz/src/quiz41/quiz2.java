package quiz41;

public class quiz2 implements Runnable{

	int finish =10;
	@Override
	public void run() {
		System.out.print("동영상을 다운로드 합니다.");
		for(int i =0;i<finish;i++){
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

