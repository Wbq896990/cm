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
    <title>新建订单</title>
</head>
<body>
<form id="insertOrdersForm" action="${pageContext.request.contextPath}/orders/insertOrders.action"
      method="post" enctype="application/x-www-form-urlencoded">
    新建订单：
    <table width="100%" border="1">
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <td>车牌号</td>
            <td><input type="text" name="carid"></td>
        </tr>
        <tr>
            <td>维修项目</td>
            <td><input type="text" name="projectname"></td>
        </tr>
        <tr>
            <td>价格</td>
            <td><input type="text" name="price"></td>
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
</form>
</body>
</html>
