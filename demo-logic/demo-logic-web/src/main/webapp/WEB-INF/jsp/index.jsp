<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 24/11/2018
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>INDEX</title>
</head>
<body>
<h1 style="font-family: 'Adobe Garamond Pro Bold';color: chocolate;text-align: center">欢迎来到rick的小家园</h1>
<div style="text-align: center">
    <b style="font-size: larger">尊敬的 <b style="color: chocolate">${user.nickname}</b>, 您好</b>
</div>
<a href="saveUser.do"><b style="font-family: 'Adobe Ming Std L'">添加新学生信息</b></a>
<a href="querylist.do"><b style="font-family: 'Adobe Ming Std L'">查看学生列表</b></a>
<a href="goToUpload.do"><b style="font-family: 'Adobe Ming Std L'">上传照片</b></a>
<a href="/upload/queryPhotoList.do"><b style="font-family: 'Adobe Ming Std L'">查看照片墙</b></a>

</body>
</html>
