package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {

	private Connection con; //mysql 연결
	private PreparedStatement pstmt;  // sql 문장 전송 
	
	private final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
	
	//드라이버 등록 : 한번만 등록하면된다.
	public Database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//연결
	public void getConnection() {
		try {
			con = DriverManager.getConnection(URL, "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//연결해제
	public void disConnection() {
		try {
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 리스트 목록
	public void mydbListData() {
		try {
			//1. mysql 연결
			getConnection();
			
			//2. SQL문장 작성
			String sql = "select * from member";
			
			//3. MySql로 SQL문장 전송
			pstmt = con.prepareStatement(sql);
			
			//4. 실행결과를 받아 온다.
			ResultSet rs = pstmt.executeQuery();
			
			//5. 결과를 출력
			while (rs.next()) {
				System.out.println(rs.getInt(1)
						+ ", " + rs.getString(2)
						+ ", " + rs.getString(3)
						+ ", " + rs.getString(4) + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	//추가(Insert)
	public void mydbInsert(int no, String name, String sex, String content) {
		try {
			//1. 연결
			getConnection();
			
			//2. sql문장 작성
			String sql = "insert into member(no, name, sex, content) " 
					+ "values(?,?,?,?)";
			//3. mySql로 SQL문장 전송
			pstmt = con.prepareStatement(sql);
			
			//4. ????에 값을 채운다.
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			pstmt.setString(3, sex);
			pstmt.setString(4, content);
			
			//5. 실행
			pstmt.executeUpdate(); //db 값 변동시에는 executeUpdate
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public void mydbInsert(int no, String title, String content) {
		try {
			//1. 연결
			getConnection();
			
			//2. sql문장 작성
			String sql = "insert into naver(no, title, content) " 
					+ "values(?,?,?)";
			//3. mySql로 SQL문장 전송
			pstmt = con.prepareStatement(sql);
			
			//4. ????에 값을 채운다.
			pstmt.setInt(1, no);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			
			//5. 실행
			pstmt.executeUpdate(); //db 값 변동시에는 executeUpdate
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	//수정
	public void mydbUpdate(int no, String name, String sex, String content) {
		try {
			getConnection();
			String sql = "update member set name=?, sex=?, content=? "
					+ "where no = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, sex);
			pstmt.setString(3, content);
			pstmt.setInt(4, no);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public void mydbUpdate(int no, String title, String content) {
		try {
			getConnection();
			String sql = "update naver set title=?, content=?"
					+ "where no = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, no);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	
	
	public void mydbDelete(int no) {
		try {
			getConnection();
			String sql = "delete from member where no = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	//검색
	public void mydbSearch(int no) {
		try {
			getConnection();
			String sql = "select * from member where no = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			System.out.println(rs.getInt(1) + ", " 
							+ rs.getString(2) + ", " 
							+ rs.getString(3) + ", " 
							+ rs.getString(4) + " ");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	public static void main(String[] args) {
		Database db = new Database();
		db.getConnection();
		db.mydbListData();
		System.out.println("-------------------------");
		db.mydbUpdate(15, "김연정", "여성", "배구선수");
		db.mydbListData();
		System.out.println("-------------------------");
		db.mydbDelete(13);
		System.out.println("-------------------------");
		db.mydbListData();
		System.out.println("-------------------------");
		db.mydbSearch(10);
	}

}
