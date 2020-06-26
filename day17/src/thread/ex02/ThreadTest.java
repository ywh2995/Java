package thread.ex02;

public class ThreadTest implements Runnable{

	int num;
	
	@Override
	public synchronized void run() {
		
		for(int i=1;i<=10;i++) {
			
			if(Thread.currentThread().getName().equals("A")){
				System.out.println("===========================================");
				num++;
			}
			
			System.out.println("쓰레드 명:"+Thread.currentThread().getName()+", num :"+num);
			
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
