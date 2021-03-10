<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exam03</title>
<script type="text/javascript" src="./param.js"></script>
</head>
<body>
	<form method="get" action="exam03.do" name="frm">
		아이디 : <input type="text" name="id" id="id"/><br>
		나이 : <input type="text" name="age" id="age"/><br>
		<input type="submit" value="전송" 
		onClick="return check();"/>
	</form>
</body>
</html>