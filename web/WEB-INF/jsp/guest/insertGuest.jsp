<%--
  Created by IntelliJ IDEA.
  User: Josh
  Date: 2018/6/6
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>新增客户</title>
</head>
<body>
<form id="insertGuestForm" action="${pageContext.request.contextPath}/guest/insertGuest.action"
      method="post" enctype="application/x-www-form-urlencoded">
    新增客户：
    <table width="100%" border="1">
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="gender"></td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <td>车型</td>
            <td><input type="text" name="car"></td>
        </tr>
        <tr>
            <td>车架号</td>
            <td><input type="text" name="chejia"></td>
        </tr>
        <tr>
            <td>车牌号</td>
            <td><input type="text" name="carid"></td>
        </tr>
        <td colspan="2" align="center">
            <input type="submit" value="提交"/>
        </td>
    </table>
</form>>
</body>
</html>
