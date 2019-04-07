<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/24
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<form method="post" action="${pageContext.request.contextPath}/Form/Adduser">
    ${error}
    username:<input type="text" name="username"></td>
    password:<input type="text" name="username"></td>
    <input type="submit" value="提交">
</form>
</body>
</html>
