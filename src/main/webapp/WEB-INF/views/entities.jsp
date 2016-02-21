<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Entities</title>
</head>
<body>
List of entities:
<table border="1" style="width:100px;">
    <tr>
        <td>ID</td>
        <td>Description</td>
    </tr>
    <c:forEach items="${entityList}" var="entityItem">
        <tr>
            <td>${entityItem.id}</td>
            <td>${entityItem.desc}</td>
        </tr>
    </c:forEach>

</table>
<br>
</body>
</html>
