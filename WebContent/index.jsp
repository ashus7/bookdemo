<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="getInputs" method="post">
<select name="searchBy">
<option value="isbn">ISBN</option>
<option value="author">AUTHOR</option>
<option value="title">TITLE</option>
</select>
	<input type="text" name="searchVal">
	<input type="submit" title="Get Data">
</form>
</body>
</html>