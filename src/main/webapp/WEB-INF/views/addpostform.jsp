<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addok" method="POST">
<table id="edit">
<tr><td>Subject:</td><td><input type="text" name="subject"/></td></tr>
<tr><td>Writer:</td><td><input type="text" name="subject_code"/></td></tr>
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
<tr><td>Comment:</td><td><textarea cols="50" rows="5" name="comment"></textarea></td></tr>
<tr><td></td></tr>
</table>
    <button type="submit">등록하기</button>
    <button type="button" onclick="location.href='list'">목록보기</button>

</form>

</body>
</html>