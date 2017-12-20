<%--
  Created by IntelliJ IDEA.
  User: www
  Date: 2017/12/20
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page session="true"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<html xmlns:th="http://www.thymeleaf.org"
        xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4">
<head>
    <title>LOGIN</title>
</head>
<body>
<form:form action="login.do" method="post">
    <table>
        <tr>
            <td> 用户名：</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td> 密码：</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value=" 登录 "/>
                <input type="reset" value=" 重置 "/>
            </td>
        </tr>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </table>
</form:form>
</body>
</html>

