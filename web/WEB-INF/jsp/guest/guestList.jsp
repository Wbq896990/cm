<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Josh
  Date: 2018/6/5
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<html>
<head>
    <title>客户列表</title>
</head>
<body>
<form id="queryGuestForm" action="${pageContext.request.contextPath}/guest/queryGuest.action"
       method="post" enctype="application/x-www-form-urlencoded">
    根据手机号搜索：
    <input type="text" name="phone"/>
    <input type="submit" value="搜索"/>
</form>
客户列表：
<table width="100%" border=1>
    <tr>
        <td>名字</td>
        <td>性别</td>
        <td>电话</td>
        <td>车型</td>
        <td>车架号</td>
        <td>车牌号</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${guestCustomList}" var="guest">
        <tr>
            <td>${guest.name }</td>
            <td>${guest.gender }</td>
            <td>${guest.phone }</td>
            <td>${guest.car }</td>
            <td>${guest.chejia }</td>
            <td>${guest.carid }</td>
            <td>
                <a href="${pageContext.request.contextPath}/guest/updateGuest.action?id=${guest.id }">修改</a>
                <a href="${pageContext.request.contextPath}/guest/deleteGuest.action?id=${guest.id }">删除</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td align="center" colspan="7">
            <a href="${pageContext.request.contextPath}/guest/preInsertGuest.action">新增客户</a>
        </td>
    </tr>
</table>

</body>
</html>
