package jdbc_exam;

public class Confirmer implements Person{
	
	String name;
	boolean is_infected = true;
	
	
	public Confirmer(String name, boolean is_infected) {
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
	
	
	public void SpreadInfection(Person p) {			//감염시키기
		if (p instanceof Confirmer) {
			Confirmer c = (Confirmer) p;
			System.out.println(c.getName() + "는 이미 확진자입니다");
			c.setIs_infected(true);
		}
		else if(p instanceof JustPerson) {
			JustPerson j = (JustPerson) p;
			System.out.println("일반인 " + j.getName() + "는 감염 되었습니다");
			j.setIs_infected(true);
			
		}
		else if(p instanceof Employee) {
			Employee e = (Employee) p;
			System.out.println("방역직원" + e.getName() + "는 감염 되었습니다");
			e.setIs_infected(true);
		}
	}
	
	public void Isolation_Release() {		//셀프 격리해제
		System.out.println("확진자 " + name + "은(는) 밖으로 뛰쳐 나갔습니다");
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
