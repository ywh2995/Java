package jdbc_exam;

public class Employee implements Person{

	String name;
	boolean is_infected = false;
	
	
	public Employee(String name, boolean is_infected) {
		super();
		this.name = name;
		this.is_infected = is_infected;
	}
	
	
	public void Isolation() {
		System.out.println("시설 격리 중입니다");
	}
	public void House_Isolation() {
		System.out.println("자가 격리 중입니다");
	}
	public void Report() {
		System.out.println("다른 사람을 신고했습니다");
	}

	public void Inspection(Person p) {			//검사하기
		if (p instanceof Confirmer) {
			Confirmer c = (Confirmer) p;
			System.out.println(c.getName() + "는 감염자입니다");

		}
		else if(p instanceof JustPerson) {
			JustPerson j = (JustPerson) p;
			if(j.isIs_infected() == true) {
				System.out.println(j.getName() + "는 감염자입니다");
			}
			else if(j.isIs_infected() == false) {
				System.out.println(j.getName() + "는 감염자가 아닙니다");
			}

		}
		else if(p instanceof Employee) {
			Employee e = (Employee) p;
			if(e.isIs_infected() == true) {
				System.out.println(e.getName() + "는 감염자입니다");
			}
			else if(e.isIs_infected() == false) {
				System.out.println(e.getName() + "는 감염자가 아닙니다");
			}
		}
	}

	public void work() {
		System.out.println("일합니다");
		System.out.println("힘듭니다");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean isIs_infected() {
		return is_infected;
	}
	public void setIs_infected(boolean is_infected) {
		this.is_infected = is_infected;
	}

}
