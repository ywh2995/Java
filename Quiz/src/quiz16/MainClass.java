package quiz16;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		c.setKeyBoard(new KeyBoard());
		c.getKeyBoard().info();
		
		c.setMonitor(new Monitor());
		c.getMonitor().info();
		

		c.setMouse(new Mouse());
		c.getMouse().info();
		
		c.info();
		
		
		Monitor m = c.getMonitor();
		m.info();
	}

}
