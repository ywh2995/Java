package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.command.Member01;

public class JDBCSelect2 {

	public static void main(String[] args) {
		
		/*
		 * 회원 ID를 입력받아서 해당 ID의 회원정보를 모두 출력하는 JDBC코드를 작성.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디>");
		String id2 = scan.next();
		
		//1. DB연결에 필요한 접속정보를 선언
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "select * from member01 where id = ?";
		
		Connection conn = null; //DB연결
		PreparedStatement pstmt = null; //SQL전송객체
		ResultSet rs = null; //쿼리결과 저장객체
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id2);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				
				System.out.println("-----------------");
				System.out.println("아이디 : " + id);
				System.out.println("비밀번호 : " + pw);
				System.out.println("이름 : " + name);
				System.out.println("이메일 : " + email);
				System.out.println("주소 : " + address);
			} else {
				System.out.println("id가 없습니다");
			}
		}	catch (Exception e) {
			e.printStackTrace();//에러로그
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				
			} 
		}
	}
}
