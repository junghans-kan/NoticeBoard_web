package com.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.beans.Board;
import com.board.controller.CommandAction;
import com.board.dao.BoardDao;

public class CountAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request,
			HttpServletResponse response) throws Throwable {
		int idx = Integer.parseInt(request.getParameter("idx")); // 전 페이지에서 넘어온 idx 값 받기
		
		Board article = BoardDao.getInstance().getArticle(idx); // 게시글 전체 가지옴.
		String regip = request.getRemoteAddr(); // 현재 조회를 요청한 사용자의 ip를 받음.
		
		if(!regip.equals(article.getRegip())) {
			int count = article.getCount();
			article.setCount(count++);
			BoardDao.getInstance().setArticleCount(article);
		}
		
		request.setAttribute("url", "content.do?idx="+idx);
		
		return "redirect2.jsp";
	}

}
