<%@ page import="java.util.List" %>
<%@ page import="xyz.kiwi.model.Users" %><%--
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/24 0024
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<form action="/GetName" method="get">
    <input type="text" placeholder="输入昵称查询" name="nickName"/>
    <input type="submit" value="提交" class="btn btn-primary"/>
</form>
<% List<Users> lists = (List<Users>) request.getAttribute("lists");%>
<table class="table table-bordered table-hover table-striped">
    <tr class="info">
        <th>编号</th>
        <th>账号</th>
        <th>密码</th>
        <th>昵称</th>
    </tr>
    <%
        for (Users u : lists) {
    %>
    <tr>
        <td><%=u.getId()%></td>
        <td><%=u.getUserName()%></td>
        <td><%=u.getPwd()%></td>
        <td><%=u.getNickName()%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
