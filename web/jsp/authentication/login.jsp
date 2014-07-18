<%--
  Created by IntelliJ IDEA.
  User: ivan
  Date: 7/16/14
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<form action="controller" method="post">
    <input type="hidden" name="command" value="login">
    <jsp:text>Login</jsp:text>
    <br/>
    <input type="text" name="login">
    <br/>
    <jsp:text>Password</jsp:text>
    <br/>
    <input type="text" name="password">
    <input type="submit" value="Sing in">
    <br/>
    ${errorMessage}
</form>
</html>
