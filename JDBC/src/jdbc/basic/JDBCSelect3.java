package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.command.Board01;
import jdbc.command.Member01;

public class JDBCSelect3 {

	public static void main(String[] args) {
		
		ArrayList<Board01> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("조회할 시작 데이터 : ");
		String start = scan.next();
		System.out.println("조회할 끝 데이터 : ");
		String end = scan.next();
		
		//1. DB에 필요한 변수 선언
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "select *\r\n" + 
				"from(select \r\n" + 
				"        rownum as rn,\r\n" + 
				"        num,\r\n" + 
				"        id,\r\n" + 
				"        title,\r\n" + 
				"        content\r\n" + 
				"    from(select\r\n" + 
				"            num,\r\n" + 
				"            id,\r\n" + 
				"            title,\r\n" + 
				"            content\r\n" + 
				"        from board01\r\n" + 
				"        order by num desc))\r\n" + 
				"where rn > ? and rn <= ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			/*
			 * 조회한 데이터를 출력, Board01클래스를 생성해서 순서대로 저장하는 JDBC코드를 완성하세요.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, start);
			pstmt.setString(2, end);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String id = rs.getString("id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				
				System.out.println("-----------------");
				System.out.println(num);
				System.out.println(id);
				System.out.println(title);
				System.out.println(content);
				
				Board01 board = new Board01(num, id, title, content);
				list.add(board);
			}
			System.out.println(list.size());
		} catch (Exception e) {
			e.printStackTrace();
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
