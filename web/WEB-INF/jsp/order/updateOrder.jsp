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
    <form id="orderForm" action="${pageContext.request.contextPath}/order/updateOrderSubmit.action"
          method="post" enctype="application/x-www-form-urlencoded">
        <input type="hidden" name="id" value="${orderCustom.id}"/>
        修改订单信息：
        <table width="100%" border="1">
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name" value="${orderCustom.name}"></td>
            </tr>
            <tr>
                <td>电话</td>
                <td><input type="text" name="phone" value="${orderCustom.phone}"></td>
            </tr>
            <tr>
                <td>车牌号</td>
                <td><input type="text" name="carid" value="${orderCustom.phone}"></td>
            </tr>
            <tr>
                <td>维修项目</td>
                <td><input type="text" name="projectname" value="${orderCustom.projectname}"></td>
            </tr>
            <tr>
                <td>价格</td>
                <td><input type="text" name="price" value="${orderCustom.price}"></td>
            </tr>
            <tr>
                <td>日期</td>
                <td><input type="text" name="date" value="${orderCustom.date}"></td>
            </tr>
            <td colspan="2" align="center">
                <input type="submit" value="提交"/>
            </td>
        </table>
    </form>>
</body>
</html>
