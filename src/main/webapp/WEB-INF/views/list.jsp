<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         isELIgnored="false"
         pageEncoding="UTF-8" %>

<%@page import="com.tuto.member.BoardDAO, com.tuto.member.BoardVO,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>free board</title>
    <style>
        #list {
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }
        #list td, #list th {
            border: 1px solid #ddd;
            padding: 8px;
            text-align:center;
        }
        #list tr:nth-child(even){background-color: #f2f2f2;}
        #list tr:hover {background-color: #ddd;}
        #list th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: center;
            background-color: #006bb3;
            color: white;
        }
    </style>
    <script>
        function delete_ok(id){
            var a = confirm("정말로 삭제하겠습니까?");
            if(a) location.href="deleteok/" + id;
        }
        function logout_ok(){
            var a = confirm("로그아웃 하시겠습니까?");
            if(a) location.href="/p3_21500772_1/login/logout";
        }
    </script>
</head>
<body>
<h1>자유게시판</h1>

<table id="list" width="90%">
    <tr>
        <th>Id</th>
        <th>subject</th>
        <th>code</th>
        <th>session</th>
        <th>grade</th>
        <th>Content</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${lists}" var="u">
        <tr>
            <td>${u.getSeq()}</td>
            <td>${u.getSubject()}</td>
            <td>${u.getSubject_code()}</td>
            <td>${u.getSesssion()}</td>
            <td>${u.getGrade()}</td>
            <td>${u.getComment()}</td>
            <td><a href="editform/${u.getSeq()}">Edit</a></td>
            <td><a href="javascript:delete_ok('${u.getSeq()}')">Delete</a></td>

        </tr>
    </c:forEach>
</table>
<br/><button type="button" onclick="location.href='redirect:/login/signup'">유저 정보 변경</button>
<br/><button type="button" onclick="location.href='add'">새글쓰기</button>
<a href="javascript:logout_ok()">로그아웃</a>
</body>
</html>