<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert.jsp" method="post" onsubmit="return formCheck();"> 
		title : <input type="text" name="title"><br>
		writer : <input type="text" name="writer"><br>
		<!-- regdate : <input type="text" name="regdate"><br> -->
		content : <textarea rows="10" cols="20" name="content"></textarea><br>
		<input type="submit">		
	</form>

	<script>

		function formCheck() {
			//사용 편의성 위해 변수에 담아둠.
			var title = document.forms[0].title.value;
			var writer = document.forms[0].writer.value;
			var content = document.forms[0].content.value;
			 
		}
	</script>
</body>
</html>