<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>产品页面</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
<table cellspacing="0" border="1">
    <tr><th>ID</th></tr>
</table>
<c:forEach items="${products}" var="product">
    ${product.id}
</c:forEach>

</body>
</html>
