<%--
  Created by IntelliJ IDEA.
  User: Mis.Fu
  Date: 2018/4/17
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/layui/css/layui.css" media="all">
  <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
</head>

<body>
<div class="layui-container">

</div>

<script src="${pageContext.request.contextPath}/plugins/layui/layui.js"></script>
<script>
  layui.config({
    base: 'js/'
  }).use(function() {
    // var tab = layui.tab;
    // debugger;
    // if (tab.tabExists())
    //     tab.tabAdd();
  });
</script>
</body>

</html>
