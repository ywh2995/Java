package quiz23;

public class BugsMusic implements SongList{
	
	private String [] List = new String [100];
	private int count = 0;
	
	@Override
	public void insertList(String song) {
		
		List[count]=song;
		count ++;
	}
	@Override
	public void playList() {
		// TODO Auto-generated method stub
		int rd = (int) (Math.random()*count);
		System.out.println(List[rd]+"를 재생합니다");
		
	}
	@Override
	public int playLength() {
		// TODO Auto-generated method stub
		return count;
	}
	
/* SongList인터페이스 상속
 * 마음대로~
 */
}
