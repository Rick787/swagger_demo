<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 26/11/2018
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REGISTER</title>
</head>
<body>
<form name=userForm action="newUser.do" method=post>
    <div style="text-align: center">
        <h2 style="color: darkgreen">新用户注册</h2>
    </div>
    <table align="center">
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"/></td>
        <tr/>
        <tr>
            <td>昵称：</td>
            <td><input type="text" name="nickname"/></td>
        <tr/>
        <tr>
            <td colspan="2" ,align="center">
                <input type="submit" value="submit"/>
                <input type="reset" value="reset"/>
            </td>
        </tr>
    </table>
    <div style="text-align: center"><a href="index">返回首页</a></div>
</form>

</body>
</html>
