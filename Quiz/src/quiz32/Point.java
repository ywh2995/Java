package quiz32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Point implements InterPoint{
	

	@Override
	public void showPointUI() {
		// TODO Auto-generated method stub
	
		System.out.println("===========================================================");
		System.out.printf("%4s%10s%10s%10s %11s%11s%11s %11s\n"
				, "학번", "이름", "국어", "영어", "수학", "총점"
				, "평균", "학점");
		System.out.println("===========================================================");
		
	}

	@Override
	public void input(List<Student> students) {
		Student stu = new Student();
		stu.inputStuInfo();
		
		for(int i=0;i<students.size();i++) {
			if(stu.getStuId().equals(students.get(i).getStuId())) {
				System.out.println("이미 등록된 학번 입니다.");
				return;
			}
		}
		stu.calcTotAvg();
		
		students.add(stu);
		System.out.println(stu.getName()+"님의 정보가 정상 적으로 입력되었습니다.");
		
		
		
	}

	@Override
	public void showAll(List<Student> students) {
		double cAvg =0;
		showPointUI();
		for(int i=0;i<students.size();i++) {
			students.get(i).outputInfo();;
			cAvg +=students.get(i).getAvg();
			
		}
		
		System.out.println("반평균 : "+ cAvg/students.size());
	}

	@Override
	public void search(List<Student> students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생의 학번을 입력해주세요.");
		String std = sc.next();
		boolean b = false;
		showPointUI();
		for(int i=0;i<students.size();i++) {
			if(std.equals(students.get(i).getStuId())) {
				students.get(i).outputInfo();
				b=true;
			}
		}
		if(b==false) {
			System.out.println("학생번호와 일치하는 학생이없습니다.");
		}
		
	}

	@Override
	public void modify(List<Student> students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 학생의 학번을 입력해주세요.");
		String std = sc.next();
		
		for(int i=0;i<students.size();i++) {
			if(std.equals(students.get(i).getStuId())) {
				System.out.print("국어 :");
				students.get(i).setKor(sc.nextInt());
				 
				System.out.print("영어 :");
				students.get(i).setEng(sc.nextInt());
				System.out.print("수학 :");
				students.get(i).setMath(sc.nextInt());
				students.get(i).calcTotAvg();
				return;
			}
		}
		
			System.out.println("학생번호와 일치하는 학생이없습니다.");
	
		
	}

	@Override
	public void delete(List<Student> students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 학생의 학번을 입력해주세요.");
		String std = sc.next();
		boolean b = false;
		for(int i=0;i<students.size();i++) {
			if(std.equals(students.get(i).getStuId())) {
				students.remove(i);
				System.out.println("삭제되었습니다.");
				
				return;
			}
		}
		System.out.println("삭제할 학생의 정보가 없습니다.");
		
	}

}
