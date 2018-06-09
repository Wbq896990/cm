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
                <a href="">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
