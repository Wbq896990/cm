<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <title>订单列表</title>
</head>
<body>
订单列表：
<table width="100%" border=1>
    <tr>
        <td>名字</td>
        <td>电话</td>
        <td>车牌号</td>
        <td>维修项目</td>
        <td>价格</td>
        <td>日期</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${ordersCustomList}" var="orders">
        <tr>
            <td>${orders.name }</td>
            <td>${orders.phone }</td>
            <td>${orders.carid }</td>
            <td>${orders.projectname }</td>
            <td>${orders.price }</td>
            <td><fmt:formatDate value="${orders.date }" pattern="yyyy-MM-dd"/></td>
            <td>
                <a href="${pageContext.request.contextPath}/orders/updateOrders.action?id=${orders.id }">修改</a>
                <a href="${pageContext.request.contextPath}/orders/deleteOrders.action?id=${orders.id }">删除</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td align="center" colspan="7">
            <a href="${pageContext.request.contextPath}/orders/preInsertOrders.action">新建订单</a>
        </td>
    </tr>
</table>

</body>
</html>
