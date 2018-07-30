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
    <title>修改客户信息</title>
</head>
<body>
    <form id="guestForm" action="${pageContext.request.contextPath}/guest/updateGuestSubmit.action"
          method="post" enctype="application/x-www-form-urlencoded">
        <input type="hidden" name="id" value="${guestCustom.id}"/>
        修改客户信息：
        <table width="100%" border="1">
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name" value="${guestCustom.name}"></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="text" name="gender" value="${guestCustom.gender}"></td>
            </tr>
            <tr>
                <td>电话</td>
                <td><input type="text" name="phone" value="${guestCustom.phone}"></td>
            </tr>
            <tr>
                <td>车型</td>
                <td><input type="text" name="car" value="${guestCustom.car}"></td>
            </tr>
            <tr>
                <td>车架号</td>
                <td><input type="text" name="chejia" value="${guestCustom.chejia}"></td>
            </tr>
            <tr>
                <td>车牌号</td>
                <td><input type="text" name="carid" value="${guestCustom.carid}"></td>
            </tr>
            <tr>
                <td align="center">
                    <input type="submit" value="提交"/>
                </td>
                <td align="center">
                    <input type="button" value="返回" onclick="history.back()"/>
                </td>
            </tr>
        </table>
    </form>>
</body>
</html>
