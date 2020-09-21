<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="java.io.PrintWriter" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
<style>
.container {
	width: 500px;
	height: 100px;
	margin-left: auto;
	margin-right: auto;
	background-color: lightgray;
}

.sign {
	width: 20px;
}

.title {
	width: 200px;
	height: 50px;
	font-size: 30px;
	font-weight: bold;
	margin-left: auto;
	margin-right: auto;
}
.equals {
	width: 250px;
}
.footer {
	width: 500px;
	height: 25px;
	background-color: lightgray;
}
.author {
	width: 170px;
	height: 25px;
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>

	<form action="result" method="post">
		<div id="container" class="container">
			<div id="equals">
				
				You are enter invalid input data:<br>
				- divide by 0;<br>
				- not correct operator.<br>
				Please <a href="https://calculator-lkutylowski.herokuapp.com/">return</a> and input valid data.
	
			</div>
			<div id="footer" class="footer">
				<div id="author" class="author">Łukasz Kutyłowski | 2020</div>
			</div>
		</div>
	</form>
	
</body>
</html>