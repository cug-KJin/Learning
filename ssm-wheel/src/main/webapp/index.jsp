<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="ssm.pojo.User" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>用户信息列表</title>
</head>
<body>
<c:forEach items="${User}" var="user">
    编号：${User.U_id}，名字：${User.U_name}<br />
</c:forEach>
</body>
</html>