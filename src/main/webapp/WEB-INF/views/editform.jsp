<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.tuto.member.BoardDAO, com.tuto.member.BoardVO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>

<h1>Edit Form</h1>
<form:form modelAttribute="boardVO"  method="POST" action="../editok">
	<form:hidden path="seq"/>
	<table id="edit">
		<tr><td>title</td><td><form:input path="title"/></td></tr>
		<tr><td>writer</td><td><form:input path="writer"/></td></tr>
		<tr><td>content</td><td><form:input path="content"/></td></tr>
	</table>
<input type="submit" value="수정하기"/>
	<input type="button" value="취소하기" onclick="history.back()"/>

</form:form>

</form>

</body>
</html>