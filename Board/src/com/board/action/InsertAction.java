package com.board.action;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.beans.Board;
import com.board.controller.CommandAction;
import com.board.dao.BoardDao;

public class InsertAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request,
			HttpServletResponse response) throws Throwable {
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		int count = 0;
		String content = request.getParameter("content");
		String regip = request.getRemoteAddr();
		// jsp 유효성 검사
		if(title == "" || title == null) 
			System.out.println("title is null");
		
		if(writer == "" || writer == null)
			System.out.println("writer is null");
		else if(!Pattern.matches("^[_0-9a-zA-Z-]+@[0-9a-zA-Z-]+(.[_0-9a-zA-Z-]+)*$*", writer))
			System.out.println("email is not right format");
		
		if(content == "" || content == null)
			System.out.println("content is null");
		
		Board article = new Board();
		
		article.setRegip(regip);
		article.setTitle(title);
		article.setWriter(writer);
		article.setContent(content);
		article.setCount(count);
		BoardDao.getInstance().insertArticle(article);
		
		return "insert.jsp";
	}

}
