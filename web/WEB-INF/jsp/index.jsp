<%--
  Created by IntelliJ IDEA.
  User: Josh
  Date: 2018/6/7
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <table border="1" width="100%">
        <tr>
            <td align="center"><a href="${pageContext.request.contextPath}/guest/queryGuest.action">客户列表</a></td>
        </tr>
        <tr>
            <td align="center"><a href="${pageContext.request.contextPath}/orders/queryOrders.action">订单列表</a> </td>
        </tr>
    </table>
</body>
</html>
