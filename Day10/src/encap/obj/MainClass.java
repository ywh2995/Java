package encap.obj;

public class MainClass {

	public static void main(String[] args) {
		Hotel h = new Hotel();
		h.setEmp(new Employee());
		h.getEmp().work();
		
		h.setChef(new Chef());
		h.getChef().cook();

		
	}
 
}
