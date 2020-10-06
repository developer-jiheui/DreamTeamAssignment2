<%--
  Created by IntelliJ IDEA.
  User: strogiyotec
  Date: 9/28/20
  Time: 8:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dream Team</title>
</head>
<body>
<h1>Group members</h1>
<c:forEach items="${members}" var="member">
    <hr/>
    <h2>Name: ${member.name()}</h2>
    <h2>Description: ${member.description()}</h2>
    <img src="<c:url value='/static/images/${member.selfiImageName()}' />"
         alt="${member.name()}" width="400" height="400">
</c:forEach>
</body>
</html>
