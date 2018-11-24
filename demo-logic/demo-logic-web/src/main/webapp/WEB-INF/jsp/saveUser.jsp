<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 24/11/2018
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body> <!-- <p1>test!</p1> --> <h2 align="center">欢迎登录</h2>
<form name=loginForm action="save.do" method=post>
    <table align="center">
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="number" name="age"/></td>
        <tr/>
        <tr>
            <td>住址：</td>
            <td><input type="text" name="address"/></td>
        <tr/>
        <tr>
            <td>备注：</td>
            <td><input type="text" name="remark"/></td>
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
