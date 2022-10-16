<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Admin Page</title>
</head>
<body>
<c:forEach var="i" begin="1" end="10">
    <c:out value="${i}"/>
</c:forEach>
</body>
</html>
