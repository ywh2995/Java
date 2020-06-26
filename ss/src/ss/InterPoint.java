package ss;

import java.util.List;

public interface InterPoint {
	public void input(List<Person> person);
	public void showAll(List<Person> person);
	public void search(List<Person> person);
	public void findpw(List<Person> person);
	
	
	public static void menuInfo() {

		System.out.println("\n*** 회원관리 프로그램 ***");
		System.out.println("# 1. 회원등록 ");
		System.out.println("# 2. 전체회원 정보 조회");
		System.out.println("# 3. 회원 검색");
		System.out.println("# 4. 비밀번호 찾기(Id로찾기)");
		System.out.println("# 5. 프로그램 종료");
		System.out.println("*********************");
	}
}
