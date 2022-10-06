<%--
  Created by IntelliJ IDEA.
  User: mokin
  Date: 06-10-2022
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Success Page</title>
</head>
<body>
<h3>Hi <%=request.getAttribute("user")%>,Login successful..</h3>
<a href="login.html">Login Page</a>
</body>
</html>
