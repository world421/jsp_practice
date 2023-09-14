<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>${boardNo}번 게시물 내용 </h2>
	<p> 
	
		# 작성자 : ${update.writer}; <br>
		# 제목 : ${update.title}; <br>
		# 내용 : <textarea rows="5" readonly> ${update.content}</textarea>
	</p>

</body>
</html>