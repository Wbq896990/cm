<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
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
    <title>修改订单信息</title>
</head>
<body>
    <form id="ordersForm" action="${pageContext.request.contextPath}/orders/updateOrdersSubmit.action"
          method="post" enctype="application/x-www-form-urlencoded">
        <input type="hidden" name="id" value="${ordersCustom.id}"/>
        修改订单信息：
        <table width="100%" border="1">
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name" value="${ordersCustom.name}"></td>
            </tr>
            <tr>
                <td>电话</td>
                <td><input type="text" name="phone" value="${ordersCustom.phone}"></td>
            </tr>
            <tr>
                <td>车牌号</td>
                <td><input type="text" name="carid" value="${ordersCustom.carid}"></td>
            </tr>
            <tr>
                <td>维修项目</td>
                <td><input type="text" name="projectname" value="${ordersCustom.projectname}"></td>
            </tr>
            <tr>
                <td>价格</td>
                <td><input type="text" name="price" value="${ordersCustom.price}"></td>
            </tr>
            <tr>
                <td>日期</td>
                <td><input type="text" name="date" value="<fmt:formatDate pattern="yyyy-MM-dd"
                value="${ordersCustom.date}"/>"/></td>
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
