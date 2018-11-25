<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 25/11/2018
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
    <form action = "login.do" method="post">
        <table align="center" style="margin-top: 20px">
            <div style="text-align: center">
                <h2 style="color: darkgreen">用户登录</h2>
            </div>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username"/></td>
            <tr/>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password"/></td>
            <tr/>
            <tr>
                <td colspan="2" ,align="center">
                    <input type="submit" value="登录"/>
                    <input type="reset" value="清空"/>
                </td>
            </tr>
        </table>
    </form>

</body>
</html>
