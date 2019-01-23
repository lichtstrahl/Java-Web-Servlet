<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Posts</title>
</head>
<body>

<table border="1">
    <c:forEach items="${posts}" var="post">
        <tr>
            <td>"${post.id}}</td>
            <td>"${post.content}"</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
