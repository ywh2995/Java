package quiz42;

public class VoteThread extends Thread{

	/*
	 * 스레드 객체 3개 생성되어야 합니다.
	 * run 메서드안에서 랜덤값을 이용해서 개표 진행사항을 출력
	 * 개표율은 100까지 
	 */
	StringBuilder sb = new StringBuilder();
	@Override
	public void run() {
		int sum=0;
		String s ="";

		while(sum<100) {
			int rd = (int) (Math.random()*20+1);

			for(int i=1;i<=100;i+=rd) {
				sb.append("*");
			}

			sum+=rd;

			if(sum>100 || sum ==100) {
				sb.delete(0, sum);
				
				for(int i = 1; i<=sum;i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName()+"개표율"+100+"% :"+sb);
				System.out.println(Thread.currentThread().getName()+"의 개표가 완료되었습니다.");
				break;
			}

			System.out.println(Thread.currentThread().getName()+"개표율"+sum+"% :"+sb);
		}
		try {

			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}









