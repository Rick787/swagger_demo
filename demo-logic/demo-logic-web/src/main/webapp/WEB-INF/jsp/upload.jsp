<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 28/11/2018
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UPLOAD</title>
</head>
<body>
    <h1>文件上传</h1>
    <form action="/upload/upload.do" method="post" enctype="multipart/form-data">
    选择一个文件:
        <input type="file" name="multipartFile"/>
        <br/><br/>
        附件描述： <input type="text" name="description"/>
        <br/><br/>
        <input type="submit" value="上传"/>
    </form>
</body>
</html>
