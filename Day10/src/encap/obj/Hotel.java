package encap.obj;

public class Hotel {
	
	private Employee emp;
	private Chef chef;
	
	
	
	public Hotel() {
		this.emp = new Employee();
		this.chef = new Chef();
	
	}
	
	
	
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Employee getEmp() {
		return emp;
	}
	
	
	
	public void setChef(Chef c) {
		this.chef = c;
	}
	public Chef getChef() {
		return chef;
	}
	
}
	

