<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.tuto.us	er.UserDAO, com.tuto.user.UserVO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>

<h1>Edit Form</h1>
<form:form modelAttribute="userVO"  method="POST" action="../editok">
	<form:hidden path="seq"/>
	<table id="edit">
		<tr><td>title</td><td><form:input path="userid"/></td></tr>
		<tr><td>writer</td><td><form:input path="password"/></td></tr>
<%--		<tr>--%>
<%--			<td>session</td>--%>
<%--			<td><form:select path="session"/></td>--%>
<%--<form:option value="s"--%>
<%--		</tr>--%>
<%--		<tr><td>content</td><td><form:input path="comment"/></td></tr>--%>

	</table>
<input type="submit" value="수정하기"/>
	<input type="button" value="취소하기" onclick="history.back()"/>

</form:form>

</form>

</body>
</html>