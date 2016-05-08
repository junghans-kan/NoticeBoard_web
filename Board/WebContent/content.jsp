<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.util.regex.Pattern"%>
<%@ page import="java.sql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- JSTL 사용 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 조회</title>

<link rel="stylesheet" href="style.css">

</head>
	
 
<body>
	<div class="table-title">                                         
    	<h1>Article Inquiry</h1>
   	</div>                    
    <table class="table-fill">                            <!-- border은 테두리를 표시하는 속성 -->
        <thead>
	        <tr>                                 
	            <th>Number</th>                    
	            <td>${article.idx}</td>
	            <th>Writer</th>
	            <td>${article.writer}</td>
	            <td>IP</td>
	            <td>${article.regip}</td>
	            <th>Date</th>
	            <td>${article.regdate}</td>
	            <th>Hit</th>
	            <td>${article.count}</td>
	        </tr>
        </thead>
        <tbody class="text-hover">
	        <tr>
	            <th colspan="2">Title</th>                     <!-- colspan은 행병합 속성 -->
	            <td colspan="8">${article.title}</td>
	        </tr>
	        <tr>
	            <th colspan="2">Content</th>                    
	            <td colspan="8">${article.content}</td>
	        </tr>
        </tbody>
    </table>
 
 	<div align= "center">
    	<a href="delete.do?idx=${article.idx}">Article delete</a> 
    	<a href="list.do">Going to list</a>
	</div>
</body>
</html>