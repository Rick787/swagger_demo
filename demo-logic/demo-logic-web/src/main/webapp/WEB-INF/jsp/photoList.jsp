<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 28/11/2018
  Time: 6:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>照片墙</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>圖片描述</td>
            <td>圖片預覽</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${fileList}" var="file">
            <tr>
                <td><b>${file.description}</b></td>
                <td><img src="${file.filePath}" width="200px" height="200px"></td>
                <td><a href="/upload/deletePhoto.do?id=${file.id}"><b style="color: red">DELETE</b></a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
