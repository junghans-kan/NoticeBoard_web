<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%-- <%@ page import="java.util.regex.Pattern"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.board.beans.Board"%>
<%@ page import="java.util.ArrayList"%> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Notice Board practice</title>

<link rel="stylesheet" href="style.css">

</head>

	
	<body>
	<div class="table-title">
		<h3>Article List</h3>
	</div>
	<table class="table-fill">
		<thead>
			<tr>
				<th>Number</th>
				<th>Title</th>
				<th>Writer</th>
				<th>Date</th>
				<th>Hit</th>
			</tr>
		</thead>
		<c:forEach items="${articleList}" var="article">
			<tbody class="text-hover">
				<tr>
					<td>${article.idx}</td>
					<td><a href='count.do?idx=${article.idx}'>${article.title}</a></td>
					<td>${article.writer}</td>
					<td>${article.regdate}</td>
					<td>${article.count}</td>
				</tr>
			</tbody>
		</c:forEach>

	</table>
	<div align= "center">
		<c:if test="${page > 0}">
				<a href="list.do?page=${page-5}">Previous Page</a>
		</c:if>
		<c:if test="${page == 0}">
				<a href="#">Previous Page</a>
		</c:if>
		<fmt:parseNumber value="${page/5+1}" type="number" integerOnly="True" /> Page
		
		<c:if test="${fn:length(articleList) < 5}">
				<a href="#">Next Page</a>
		</c:if>
		<c:if test="${fn:length(articleList) == 5}">
				<a href="list.do?page=${page+5}">Next Page</a>
		</c:if>
		
		<br/>
		<a href="write.jsp">Writing</a>
	</div>
</body>
</html>