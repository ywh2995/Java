package quiz21;

public abstract class Unit {
	
	public  int x;
	public  int y;
	public 	int hp;
	
	public Unit(int x,int y,int hp) {
		this.hp = hp;
		this.x = x;
		this.y = y;	
	}
	
	public abstract void location();
	
	public abstract void move(int x,int y); 
		
	
	public void stop() {
		System.out.println("정지");
	}

}
