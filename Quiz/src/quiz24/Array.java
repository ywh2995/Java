package quiz24;

public class Array implements IBag {

	int index;
	private String[] arr = new String[100];
	@Override
	public void insert(String item) {
		// TODO Auto-generated method stub
		arr[index] = item;
		index++;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(index+"개 저장됬습니다.");
	}

	@Override
	public int search(String item) {
		// TODO Auto-generated method stub
		for(int j =0;j<index;j++) {
			if(arr[j].equals(item)) {
				return j;
			}
		}
		return -1;


	}

	@Override
	public boolean delete(String item) {
		// TODO Auto-generated method stub

		for(int i=0;i<this.index;i++) {
			if(arr[i].equals(item)) {
				for(int j=i;j<this.index-1;j++) {
					arr[j] = arr[j+1];			
				}
				this.index--;
				return true;
			}	
		}
		return false;


	}


}
