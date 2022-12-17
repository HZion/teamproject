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
		<tr><td>title</td><td><form:input path="subject"/></td></tr>
		<tr><td>writer</td><td><form:input path="subject_code"/></td></tr>
		<tr><td>Session:</td><td>
			<select name="sesssion">
				<option value="선택" selected>===선택===</option>
				<option value="1-1">1-1</option>
				<option value="1-s">1-s</option>
				<option value="1-2">1-2</option>
				<option value="1-w">1-w</option>
				<option value="2-1">2-1</option>
				<option value="2-s">2-s</option>
				<option value="2-2">2-2</option>
				<option value="2-w">2-w</option>
				<option value="3-1">3-1</option>
				<option value="3-s">3-s</option>
				<option value="3-2">3-2</option>
				<option value="3-w">3-w</option>
				<option value="4-1">4-1</option>
				<option value="4-s">4-s</option>
				<option value="4-2">4-2</option>
				<option value="4-w">4-w</option>
			</select>
		</td></tr>
		<tr><td>Grade:</td><td><select name="grade">
			<option value="선택" selected>===선택===</option>
			<option value="A+">A+</option>
			<option value="A">A</option>
			<option value="B+">B+</option>
			<option value="B">B</option>
			<option value="C+">C+</option>
			<option value="C">C</option>
			<option value="D+">D+</option>
			<option value="D">D</option>
			<option value="F">F</option>
		</select></td></tr>
		<tr><td>IsEnglish:</td><td><input type="checkbox"></td></tr>
		<tr><td>content</td><td><form:input path="comment"/></td></tr>

	</table>
<input type="submit" value="수정하기"/>
	<input type="button" value="취소하기" onclick="history.back()"/>

</form:form>

</form>

</body>
</html>