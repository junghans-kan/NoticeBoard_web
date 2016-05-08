package com.board.dao;


import com.board.db.sqlconfig.IBatisDBConnector;
import com.ibatis.sqlmap.client.SqlMapClient;

public class CommonDao {
	private SqlMapClient myDB;
	public void SetDB() {
		myDB = IBatisDBConnector.getSqlMapInstance();
	}
	
	protected SqlMapClient GetDB(){
		return myDB;
	}
	
	/*	// 공통적으로 쓰일 접속에 관련한 정보 변수들을 상수로 선언
	private final String driverName = "oracle.jdbc.driver.OracleDriver";
	private final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private final String db_id = "board";
	private final String db_pw = "wjdgks2";
	
	// 접속에 필요한 변수 선언
	private Connection con = null;
	private Statement stmt = null;
	
	// db접속정보를 가지고 접속 후 sql문을 사용하기 위해 필요한 statement 객체를 반환하는
	// openConnection 메소드를 구현
	public Statement openConnection() {
		
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url, db_id, db_pw);
			stmt = con.createStatement();
		} catch (Exception e) {
			System.err.println("Oracle Database Connection Something Problem!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return stmt;
	}
	
	// 접속을 종료하기 위한 closeConnection 메소드 구현
	public void closeConnection() {
		try {
			if(!con.isClosed()) 
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
}
