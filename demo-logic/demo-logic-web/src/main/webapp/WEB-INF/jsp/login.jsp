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
    <link rel="stylesheet" href="/statics/css/zTreeStyle.css" type="text/css" >
    <script type="text/javascript" src="/statics/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/statics/js/jquery.ztree.core.js"></script>

</head>
<body>
    <form id="formId">
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
                    <input type="button" value="登录" onclick="submitForm()"/>
                    <a href="register.do"><input type="button" value="注册新用户"></a></td>
                </td>
            </tr>
        </table>
    </form>
    <div>
        <ul id="treeDemo" class="ztree"></ul>
    </div>
<script language="JavaScript">

    function submitForm() {
        $.ajax({
            type : 'post',
            url : 'login.do',
            data : $("#formId").serialize(),
            dataType: 'json',
            error: function(data){
                alert(data)
            },
            success: function (data) {
                if(data != -1){
                    window.location.href = "loginSuccess.do?id="+data;
                }else {
                    alert("用户名或者密码错误");
                }
            }
        })
    }

    // var setting = {
    //     isSimpleData : true,              //数据是否采用简单 Array 格式，默认false
    //     treeNodeKey : "id",               //在isSimpleData格式下，当前节点id属性
    //     treeNodeParentKey : "parentId",        //在isSimpleData格式下，当前节点的父节点id属性
    //     showLine : true,                  //是否显示节点间的连线
    //     checkable : true                  //每个节点上是否显示 CheckBox
    // };
    var setting = {
        data: {
            simpleData: {
                enable: true,
                idKey: "id",
                pIdKey: "parentId",
                rootPId: 0
            }
        },

        view: {
            showLine: false,
            fontCss:  {color:"black", "font-weight": "bold"}
        }
    };
    // // zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
    // var nodes = [
    //     {"id":1, "pId":0, "name":"test1"},
    //     {"id":11, "pId":1, "name":"test11"},
    //     {"id":12, "pId":1, "name":"test12"},
    //     {"id":111, "pId":11, "name":"test111"}
    // ];

    var zTreeObj;
    var nodes;

    $(document).ready(function(){
        $.ajax({
            async : false,
            cache: false,
            type: 'POST',
            dataType : "json",
            url: '/test/getTreeNodes',//请求的action路径
            error: function (data) {//请求失败处理函数
                alert(data)
                alert('请求失败');
            },
            success:function(data){ //请求成功后处理函数。
                alert(data);
                console.log(data);
                nodes = data;   //把后台封装好的简单Json格式赋给treeNodes
            }
        });

        zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, nodes);
    });
</script>

</body>
</html>
