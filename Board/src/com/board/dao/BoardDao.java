package com.board.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.board.beans.Board;

public class BoardDao extends CommonDao{
	
	public static BoardDao getInstance() {
		BoardDao _instance = new BoardDao();
		_instance.SetDB();
		return _instance;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Board> getArticleList(int page) throws SQLException {
		return (ArrayList<Board>)GetDB().queryForList("getArticleList", null, page, 5);
	}
	
	public Board getArticle(int idx) throws SQLException {
		return (Board)GetDB().queryForObject("getArticle", idx);
	}
	
	public void insertArticle(Board article) throws SQLException {
		GetDB().insert("insertArticle", article);
	}
	
	public void deleteArticle(int idx) throws SQLException {
		GetDB().delete("deleteArticle", idx);
	}
	
	public void setArticleCount(Board article) throws SQLException {
		GetDB().update("setArticleCount", article);
	}


	
	
	
	/*public ArrayList<Board> getArticelList() throws SQLException {
		ResultSet rs = null;
		String sql = "select * from board order by idx desc";
		// sql 실행을 위해 연결을 열어 쿼리를 실행하고 rs에 반환
		rs = openConnection().executeQuery(sql);
		
		ArrayList<Board> articleList = new ArrayList<Board>(); // Board형 배열객체 선언
		while(rs.next()) {
			Board article = new Board(); // 데이터를 담기위해 Board객체에 메모리를 할당
			
			article.setIdx(rs.getInt("idx"));
			article.setTitle(rs.getString("title"));
			article.setWriter(rs.getString("writer"));
			article.setRegdate(rs.getString("reg_date"));
			
			articleList.add(article); // 세팅된 빈을 리스트에 추가
		}
		
		closeConnection(); // 연결 닫기
		
		return articleList;
	}*/
	
}
