<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 24/11/2018
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>USERLIST</title>
</head>
<body>
  <table border="1">
      <tr>
          <td>id</td>
          <td>name</td>
          <td>age</td>
          <td>address</td>
          <td>remark</td>
      </tr>
      <c:forEach items="${userList}" var="user">
          <tr>
              <td>${user.id}</td>
              <td>${user.name}</td>
              <td>${user.age}</td>
              <td>${user.address}</td>
              <td>${user.remark}</td>
          </tr>
      </c:forEach>
  </table>
  <div style="text-align: center"><a href="index">返回首页</a></div>
</body>
</html>
