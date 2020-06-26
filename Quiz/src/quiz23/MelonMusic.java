package quiz23;

public class MelonMusic implements SongList{
	private String [] List = new String [100];
	private int count = 0;
	/*
	 * SongList 인터페이스를 상속받아서 기능을 구현합니다.
	 * insertList() 는 List배열에 순서대로 저장
	 * playList() list의 음악을 랜덤하게 출력
	 * playLength()는 저장된 음악의 개수를 반환
	 */
	@Override
	public void insertList(String song) {
		
		List[count]=song;
		count ++;
	}
	@Override
	public void playList() {
		// TODO Auto-generated method stub
		for(int i =0;i<count;i++) {
			int rd = (int) (Math.random()*count);
		System.out.println(List[rd]+"를 재생합니다");
		}
	}
	@Override
	public int playLength() {
		// TODO Auto-generated method stub
		return count;
	}
	

	
}
